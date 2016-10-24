package au.gov.nla.repository;

import java.util.List;

import au.gov.nla.entity.Book;


/**
 * The Interface IBookRepository.
 */
public interface IBookRepository {

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Book> findAll();
}
