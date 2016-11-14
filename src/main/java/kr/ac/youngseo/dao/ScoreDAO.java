package kr.ac.youngseo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.ac.youngseo.model.Score;

//compiler가 component를 자동으로 bean 등록
@Component("ScoreDAO")
public class ScoreDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	// 레코드 수 return
	public int getRowCount() {
		String sqlStatement = "Select count(*) from score";

		// sql문을 수행 후 하나의 객체(integer 타입)를 return
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	public Score getScore(String name) {
		String sqlStatement = "select * from score when name = ?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { name }, new ScoreMapper());
	}

	public List<Score> getScores() {
		String sqlStatement = "select * from score";

		return jdbcTemplateObject.query(sqlStatement, new ScoreMapper());
	}

	public boolean insert(Score score) {

		String name = score.getName();
		int win = score.getWin();
		int draw = score.getDraw();
		int lose = score.getLose();

		String sqlStatement = "insert into score (name, win, draw, lose) values (?, ?, ?, ?)";

		return jdbcTemplateObject.update(sqlStatement, new Object[] { name, win, draw, lose }) == 1;
	}

	public boolean update(Score score) {

		String name = score.getName();
		int win = score.getWin();
		int draw = score.getDraw();
		int lose = score.getLose();

		String sqlStatement = "update score set win=?, draw=?, lose=? when name=?";

		return jdbcTemplateObject.update(sqlStatement, new Object[] { name, win, draw, lose }) == 1;
	}
}
