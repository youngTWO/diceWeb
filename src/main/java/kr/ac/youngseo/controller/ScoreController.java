package kr.ac.youngseo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.youngseo.model.Score;
import kr.ac.youngseo.service.ScoreService;

@Controller
public class ScoreController {
	
	private ScoreService scoreService;
	
	
	@Autowired
	public void setScoreService(ScoreService scoreService) {
		this.scoreService = scoreService;
	}

	@RequestMapping(value="/score", method = RequestMethod.GET)
	public String score(Model model) {
		
		List<Score> score = scoreService.getCurrent();
		
		model.addAttribute("score", score);
		
		return "score";
	}
	
	/*
	 *
	 */
}
