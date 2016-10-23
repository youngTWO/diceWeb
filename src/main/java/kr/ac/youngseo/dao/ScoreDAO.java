package kr.ac.youngseo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.youngseo.model.Score;

@Repository
public class ScoreDAO {
	Connection connection;
	
	public ScoreDAO() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dicegame_db", "root", "csedbadmin");
	}
	
	public void insertScore(Score score) throws SQLException {
		
		PreparedStatement ps = connection.prepareStatement("insert into score(playerName,win,lose,draw) value(?,?,?,?)");
		
		ps.setString(1, score.getplayerName());
		ps.setInt(2, score.getWin());
		ps.setInt(3, score.getDraw());
		ps.setInt(4, score.getLose());
		
		ps.executeUpdate();
		
		ps.close();
	}
	
	public List<Score> selectAll() throws Exception {
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT * FROM SCORETB");
			
			ArrayList<Score> score = new ArrayList<Score>();
			
			while(rs.next()) {
				score.add(new Score().setplayerName(rs.getString("playerName")).setWin(rs.getInt("win"))
						.setDraw(rs.getInt("draw")).setLose(rs.getInt("lose")));
			}
			
			return score;
			
		} catch(Exception e) {
			
			throw e;
			
		} finally {
			
			try {
				if(rs != null)
					rs.close();
			} catch(Exception e) {

			}
			
			try {
				if(stmt != null)
					stmt.close();
			} catch(Exception e) {
				
			}
		}
	}
	
	public Score selecOne(String playerName) throws Exception {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT PLAYERNAME, WIN, DRAW, LOSE FROM SCORETB" + " WHERE PLAYERNAME=" + "'" + playerName + "'");
			
			if (rs.next()) {
				return new Score().setplayerName(rs.getString("playerName")).setWin(rs.getInt("win"))
						.setDraw(rs.getInt("draw")).setLose(rs.getInt("lose"));
			}
			else {
				return null;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				
			}
		}
	}
	
	public int update(Score score) throws Exception {
		PreparedStatement stmt = null;
		String playerName = score.getplayerName();
		
		try {
			stmt = connection.prepareStatement("update score set playerName=?,win=?,draw=?,lose=? where playerName=" + "'" + playerName + "'");
			stmt.setString(1, score.getplayerName());
			stmt.setInt(2, score.getWin());
			stmt.setInt(3, score.getDraw());
			stmt.setInt(4, score.getLose());

			return stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				
			}
		}
	}
}
