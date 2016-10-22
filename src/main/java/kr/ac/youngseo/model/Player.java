package kr.ac.youngseo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
	private String name;
	private int win;
	private int lose;
	private int draw;
	
	public Player(String name, int win, int lose, int draw) {
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}
	
}
