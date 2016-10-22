package kr.ac.youngseo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ScoreController {
	
	@RequestMapping(value="/score", method = RequestMethod.GET)
	public String score() {
		
		return "score";
	}
}
