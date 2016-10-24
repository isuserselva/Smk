package au.gov.nla.repository;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import au.gov.nla.entity.Book;
import au.gov.nla.test.config.SpringRootConfig;


/**
 * The Class BookRepositoryTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringRootConfig.class})
public class BookRepositoryTest {

	/** The book repository. */
	@Autowired
    private IBookRepository bookRepository;
	
	
	/**
	 * Test get all books.
	 */
	@Test
    public void testGetAllBooks() {
        List<Book> books = bookRepository.findAll();
        assertNotNull(books);
    }
	
	
}
