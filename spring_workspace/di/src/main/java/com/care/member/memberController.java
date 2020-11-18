package com.care.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
//controller로 사용하기 위해서는 위의 @Controller 반드시 필요
@RequestMapping("/member03")
public class memberController {
	@RequestMapping("index")
	public String memberIndex() {
		return "member03/index";
	}
	@RequestMapping("result01")
	public String re(MemberDTO m, Model model) {
		model.addAttribute("mem", m);
		return "member03/result";
	}
}
