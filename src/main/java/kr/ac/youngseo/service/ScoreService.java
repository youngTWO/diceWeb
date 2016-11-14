package kr.ac.youngseo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.youngseo.dao.ScoreDAO;
import kr.ac.youngseo.model.Score;

@Service("scoreService")
public class ScoreService {

	private ScoreDAO scoreDAO;

	@Autowired
	public void setScoreDAO(ScoreDAO scoreDAO) {
		this.scoreDAO = scoreDAO;
	}
	
	public List<Score> getCurrent() {
		return scoreDAO.getScores();
	}
}
 