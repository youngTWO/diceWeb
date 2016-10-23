package kr.ac.youngseo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.ac.youngseo.dao.ScoreDAO;
import kr.ac.youngseo.model.Score;

@Service
public class ScoreService {

	private static final ScoreService instance = new ScoreService();
	
	Score score;
	ScoreDAO scoreDAO;
	
	public Score initScore(String playerName) throws Exception {
		
		Score score = scoreDAO.selecOne(playerName);
		
		if(score == null) {
			score = new Score().setplayerName(playerName).setWin(0).setDraw(0).setLose(0);
			scoreDAO.insertScore(score);
		}
		
		return score;	
	}
	
	public static ScoreService getInstance() {
		return instance;
	}
	
	public List<Score> scoreView() throws Exception {

		List<Score> scores = scoreDAO.selectAll();

		return scores;
	}
	
	public void updateScore(Score score) throws Exception {
		
		scoreDAO.update(score);
	}
}
