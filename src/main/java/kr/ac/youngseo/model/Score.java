package kr.ac.youngseo.model;

public class Score {
	
	private String name;
	private int win;
	private int draw;
	private int lose;
	
	public Score() {
	}

	public Score(String playerName, int win, int draw, int lose) {
		this.name = playerName;
		this.win = win;
		this.draw = draw;
		this.lose = lose;
	}
	
	public String toString() {
		return "Score [name=" + name + ", win=" + win + ", draw=" + draw + ", lose=" + lose + "]";
	}

	public String getName() {
		return name;
	}
	public Score setName(String name) {
		this.name = name;
		
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
