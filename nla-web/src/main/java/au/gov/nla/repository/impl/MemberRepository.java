package au.gov.nla.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import au.gov.nla.entity.Member;
import au.gov.nla.repository.IMemberRepository;


/**
 * The Class MemberRepository.
 */
@Repository
public class MemberRepository implements IMemberRepository {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(MemberRepository.class);
	
	/** The entity manager. */
	@Autowired
	EntityManager em;
	
	/* (non-Javadoc)
	 * @see au.gov.nla.repository.IMemberRepository#findAll()
	 */
	@Override
	public List<Member> findAll() {

		Query q = em.createNamedQuery(Member.MEMBER_FINDALL_NAMED_QUERY);
		@SuppressWarnings("unchecked")
		List<Member> result =  (List<Member>) q.getResultList();
		return result;
	}

	/* (non-Javadoc)
	 * @see au.gov.nla.repository.IMemberRepository#findById(java.lang.Integer)
	 */
	@Override
	public Member findById(Integer userId) {
		
		Query q = em.createNamedQuery(Member.MEMBER_BY_ID_NAMED_QUERY);
		q.setParameter("userId", userId);
		Member member = null;
		try {
			member =  (Member) q.getSingleResult();
		} catch (NoResultException nre){
			if(logger.isDebugEnabled()){
				logger.debug("Member not found by Id {}", userId);
			}
		}
		return member;
	}

}
