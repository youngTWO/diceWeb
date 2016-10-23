package kr.ac.youngseo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.youngseo.service.DicegameService;

@Controller
public class ResultController {
	
	@RequestMapping(value="/result", method = RequestMethod.GET)
	public String result(HttpServletRequest request) {
		
		DicegameService service = (DicegameService) DicegameService.getInstance();
		
		request.setAttribute("service", service);
		
		return "result";
	}
}
