package kr.ac.youngseo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConfigureController {

	@RequestMapping(value = "/configure", method = RequestMethod.GET)
	public String configure() {		

		return "configure";
	}
	
}
