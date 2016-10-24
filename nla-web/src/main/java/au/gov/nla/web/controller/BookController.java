package au.gov.nla.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import au.gov.nla.entity.Book;
import au.gov.nla.repository.IBookRepository;


/**
 * The Class BookController.
 */
@Controller
public class BookController {
	
	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);

	/** The book repository. */
	@Autowired
	IBookRepository bookRepository;
	
	/**
	 * Gets the all books.
	 *
	 * @param model the model
	 * @return the all books
	 */
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String getAllBooks(Model model) {
		
		if(logger.isDebugEnabled()){
			logger.debug("getAllBooks");
		}
		
		List<Book> books = bookRepository.findAll();
		model.addAttribute("books", books);
		
		return "books";
	}

	
}
