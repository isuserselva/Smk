package au.gov.nla.test.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.transaction.annotation.EnableTransactionManagement;



/**
 * The Class SpringRootConfig.
 */
@ComponentScan(basePackages = { "au.gov.nla" }, excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = Configuration.class) })
@Configuration
@EnableTransactionManagement
public class SpringRootConfig {

	/**
	 * Data source.
	 *
	 * @return the data source
	 */
	@Bean
	public DataSource dataSource() {

		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.H2).addScript("db/sql/create-db.sql")
				.addScript("db/sql/insert-data.sql").build();
		return db;
	}
	
	/**
	 * Gets the entity manager.
	 *
	 * @return the entity manager
	 */
	@Bean
	public EntityManager getEntityManager() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NLA_UNIT_TEST");
		EntityManager em = factory.createEntityManager();
		return em;
	}

}