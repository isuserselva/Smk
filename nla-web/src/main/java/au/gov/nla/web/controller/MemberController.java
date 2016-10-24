package au.gov.nla.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import au.gov.nla.entity.Member;
import au.gov.nla.repository.IMemberRepository;


/**
 * The Class MemberController.
 */
@Controller
public class MemberController {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	/** The member repository. */
	@Autowired
	IMemberRepository memberRepository;
	
	/**
	 * Gets the all members.
	 *
	 * @param model the model
	 * @return the all members
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllMembers(Model model) {
		if(logger.isDebugEnabled()){
			logger.debug("getAllMembers");
		}
		List<Member> members = memberRepository.findAll();
		model.addAttribute("members", members);
		return "members";
	}

	/**
	 * Gets the checkouts by user id.
	 *
	 * @param userId the user id
	 * @return the check outs by user id
	 */
	@RequestMapping(value="/checkOutsByUserId", method = RequestMethod.GET)
	public @ResponseBody Member getCheckOutsByUserId(@RequestParam(value="userId") Integer userId) {
		
		if(logger.isDebugEnabled()){
			logger.debug(userId!= null ? userId.toString():"Empty user id");
		}
		Member member = memberRepository.findById(userId);
		return member;
	}
}