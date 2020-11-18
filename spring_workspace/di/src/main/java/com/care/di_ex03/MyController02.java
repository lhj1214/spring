package com.care.di_ex03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//controller로 사용하기 위해서는 위의 @Controller 반드시 필요
@RequestMapping("/member02") //위에서 처리하면 아래에는 동일한 경로는 넣을 필요없음 ("/member02/index"   => "/index/")
public class MyController02 {
	/*@RequestMapping("/member02/index")
	 	public String memberIndex() {	}
	 	사용자가 해당하는 URL 경로(http://localhost:8090/di_ex03/member02/index)에 접근하면
	 	아래의 memberIdex() 메소드가 실행됨
	 	@RequestMapping("/member02/index") 경로는 웹브라우저에 작성하는 경로...
	 	public String memberIndex() {	return "member02/index";	}
	 	경로는 jsp 파일 경로
	 	*/
	@RequestMapping("index")
	public String memberIndex() {
		return "member02/index";
	}
	@RequestMapping(value="result", method=RequestMethod.GET)//method방식 지정해서 처리하는 방법, import까지
	public String memberRe(HttpServletRequest req, Model model) {
		//req를 통해 사용자가 입력한 값을 받아와서 model에 저장 후 그 결과를 jsp로 보냄..?
		model.addAttribute("name", req.getParameter("name"));
		model.addAttribute("age", req.getParameter("age"));
		return "member02/result";
	}
	@PostMapping("result")//post 방식만 처리
	//@RequestParam("name") 을 통해 사용자가 전달한 값 받아올 수 있음
	public String memberRe02(@RequestParam("name") String n, @RequestParam("age") String a, Model model) {
		model.addAttribute("name", n);
		model.addAttribute("age", a);
		return "member02/result";
	}
}
