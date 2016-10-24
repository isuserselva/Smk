package au.gov.nla.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


/**
 * The Class Book.
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Book.findAll",
        query="SELECT b FROM Book b")
})
public class Book implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Constant BOOK_FINDALL_NAMED_QUERY. */
	public static final String BOOK_FINDALL_NAMED_QUERY = "Book.findAll";
	
	/** The id. */
	@Id
	private Integer id;
	
	/** The isbn. */
	private String isbn;
	
	/** The title. */
	private String title;
	
	/** The author. */
	private String author;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * Gets the isbn.
	 *
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * Sets the isbn.
	 *
	 * @param isbn the new isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title
				+ ", author=" + author + "]";
	}
	
}
