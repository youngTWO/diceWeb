package kr.ac.youngseo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.youngseo.model.Configure;

@Controller
public class ConfigureController {

	@RequestMapping(value = "/configure", method = RequestMethod.GET)
	public String configure(HttpServletRequest request, HttpServletResponse response) {		

		return "configure";
	}
	
}
