package au.gov.nla.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The Class Member.
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Member.findAll",
        query="SELECT m FROM Member m"),
    @NamedQuery(name="Member.findByUserId",
    	query="SELECT m FROM Member m where m.userId=:userId")
})
public class Member implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The Constant MEMBER_FINDALL_NAMED_QUERY. */
	public static final String MEMBER_FINDALL_NAMED_QUERY = "Member.findAll";
	
	/** The Constant MEMBER_BY_ID_NAMED_QUERY. */
	public static final String MEMBER_BY_ID_NAMED_QUERY = "Member.findByUserId";

	/** The user id. */
	@Id
	@Column(name="user_id")
	private Integer userId;
	
	/** The given name. */
	@Column(name="given_name")
	private String givenName;
	
	/** The last name. */
	@Column(name="last_name")
	private String lastName;
	
	/** The phone number. */
	@Column(name="phone_number")
	private String phoneNumber;
	
	/** The email. */
	private String email;

	/** The check outs. */
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="member_id", referencedColumnName="user_id")
	private Collection<Checkout> checkOuts;
	
	/**
	 * Gets the check outs.
	 *
	 * @return the check outs
	 */
	public Collection<Checkout> getCheckOuts() {
		return checkOuts;
	}

	/**
	 * Sets the check outs.
	 *
	 * @param checkOuts the new check outs
	 */
	public void setCheckOuts(Collection<Checkout> checkOuts) {
		this.checkOuts = checkOuts;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [member_id=" + userId + ", givenName=" + givenName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}


	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public Integer getUserId() {
		return userId;
	}


	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	/**
	 * Gets the given name.
	 *
	 * @return the given name
	 */
	public String getGivenName() {
		return givenName;
	}


	/**
	 * Sets the given name.
	 *
	 * @param givenName the new given name
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}


	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}