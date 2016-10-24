package au.gov.nla.repository;

import java.util.List;

import au.gov.nla.entity.Member;


/**
 * The Interface IMemberRepository.
 */
public interface IMemberRepository {

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Member> findAll();

	/**
	 * Find by id.
	 *
	 * @param userId the user id
	 * @return the member
	 */
	Member findById(Integer userId);
}
