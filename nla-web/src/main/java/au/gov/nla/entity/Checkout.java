package au.gov.nla.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;


/**
 * The Class Checkout.
 */
@Entity
public class Checkout implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	
	/** The id. */
	@Id
	private Integer id;
	
	/** The member id. */
	@Column(name="member_id")
	private Integer memberId;
	
	/** The book id. */
	@Column(name="book_id")
	private Integer bookId;
	
	/** The borrowed date. */
	@Column(name="borrowed_date")
	private Date borrowedDate;
	
	/** The due date. */
	@Column(name="due_date")
	private Date dueDate;
	
	/** The return date. */
	@Column(name="return_date")
	private Date returnDate;
	
	/** The book. */
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="book_id")
	private Book book;
	
	/** The over due flag. */
	@Transient
	private boolean overDueFlag;
	
	/**
	 * Checks if is over due flag.
	 *
	 * @return true, if is over due flag
	 */
	public boolean isOverDueFlag() {
		
		if(getReturnDate() == null){
			if(getDueDate().before(new Date())){
				overDueFlag = true;
			}
		}
		return overDueFlag;
	}
	
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
	 * Gets the member id.
	 *
	 * @return the member id
	 */
	public Integer getMemberId() {
		return memberId;
	}
	
	/**
	 * Sets the member id.
	 *
	 * @param memberId the new member id
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	
	/**
	 * Gets the book id.
	 *
	 * @return the book id
	 */
	public Integer getBookId() {
		return bookId;
	}
	
	/**
	 * Sets the book id.
	 *
	 * @param bookId the new book id
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	
	/**
	 * Gets the borrowed date.
	 *
	 * @return the borrowed date
	 */
	public Date getBorrowedDate() {
		return borrowedDate;
	}
	
	/**
	 * Sets the borrowed date.
	 *
	 * @param borrowedDate the new borrowed date
	 */
	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	
	/**
	 * Gets the due date.
	 *
	 * @return the due date
	 */
	public Date getDueDate() {
		return dueDate;
	}
	
	/**
	 * Sets the due date.
	 *
	 * @param dueDate the new due date
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	/**
	 * Gets the return date.
	 *
	 * @return the return date
	 */
	public Date getReturnDate() {
		return returnDate;
	}
	
	/**
	 * Sets the return date.
	 *
	 * @param returnDate the new return date
	 */
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	/**
	 * Gets the book.
	 *
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}
	
	/**
	 * Sets the book.
	 *
	 * @param book the new book
	 */
	public void setBook(Book book) {
		this.book = book;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Checkout [id=" + id + ", memberId=" + memberId + ", bookId=" + bookId
				+ ", borrowedDate=" + borrowedDate + ", dueDate=" + dueDate + ", returnDate=" + returnDate + "]";
	}
}
