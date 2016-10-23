package kr.ac.youngseo.model;

public class Score {
	
	private String playerName;
	private int win;
	private int draw;
	private int lose;
	
	public String getplayerName() {
		return playerName;
	}
	public Score setplayerName(String name) {
		this.playerName = name;
		
		return this;
	}
	public int getWin() {
		return win;
	}
	public Score setWin(int win) {
		this.win = win;
		
		return this;
	}
	public int getDraw() {
		return draw;
	}
	public Score setDraw(int draw) {
		this.draw = draw;
		
		return this;
	}
	public int getLose() {
		return lose;
	}
	public Score setLose(int lose) {
		this.lose = lose;
		
		return this;
	}
}
