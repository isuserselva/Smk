package au.gov.nla.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import au.gov.nla.entity.Member;
import au.gov.nla.test.config.SpringRootConfig;


/**
 * The Class MemberRepositoryTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringRootConfig.class})
public class MemberRepositoryTest {

	/** The member repository. */
	@Autowired
    private IMemberRepository memberRepository;
	
	
	/**
	 * Test get all members.
	 */
	@Test
    public void testGetAllMembers() {
        List<Member> members = memberRepository.findAll();
        assertNotNull(members);
    }
	
	/**
	 * Test get member by id.
	 */
	@Test
	public void testGetMemberById(){
		Member member = memberRepository.findById(2);
		assertNotNull(member);
	}
	
	/**
	 * Test get null member by id.
	 */
	@Test
	public void testGetNullMemberById(){
		Member member = memberRepository.findById(20);
		assertNull(member);
	}
}
