package kr.ac.youngseo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.youngseo.model.Score;
import kr.ac.youngseo.service.ScoreService;

@Controller
public class ScoreController {
	
	@RequestMapping(value="/score", method = RequestMethod.GET)
	public String score(Model model) throws Exception {
		
		/*
		ScoreService scoreService = (ScoreService) ScoreService.getInstance();
		
		List<Score> score = scoreService.scoreView();
		
		model.addAttribute("score", score);
		*/
		
		
		return "score";
	}
}
