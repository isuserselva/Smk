package au.gov.nla.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import au.gov.nla.entity.Book;
import au.gov.nla.repository.IBookRepository;


/**
 * The Class BookRepository.
 */
@Repository
public class BookRepository implements IBookRepository {

	/** The entity manager. */
	@Autowired
	EntityManager em;
	
	/* (non-Javadoc)
	 * @see au.gov.nla.repository.IBookRepository#findAll()
	 */
	@Override
	public List<Book> findAll() {

		Query q = em.createNamedQuery(Book.BOOK_FINDALL_NAMED_QUERY);
		@SuppressWarnings("unchecked")
		List<Book> result =  (List<Book>) q.getResultList();
		return result;
	}
}
