package au.gov.nla.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * The Class SpringRootConfig.
 */
@ComponentScan({ "au.gov.nla" })
@Configuration
public class SpringRootConfig {

	/**
	 * Gets the entity manager.
	 *
	 * @return the entity manager
	 */
	@Bean
	public EntityManager getEntityManager() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("NLA_UNIT");
		EntityManager em = factory.createEntityManager();
		return em;
	}

}