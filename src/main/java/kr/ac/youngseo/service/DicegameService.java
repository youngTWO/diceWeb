package kr.ac.youngseo.service;
import org.springframework.stereotype.Service;

import kr.ac.youngseo.model.Dice;
import kr.ac.youngseo.model.WinningStatus;

@Service
public class DicegameService {

	private static final DicegameService instance = new DicegameService();
	
	private String playerName;
	private String resultMessage=" ";
	
	private int[] cell;
	final private int Goal = 29;
	
	private Dice playerDice;
	private Dice alphaDice;
	private int faceValue1;
	private int faceValue2;
	
	private int curCell1;
	private int curCell2;
	
	public static DicegameService getInstance() {
		return instance;
	}
	
	//constructor
	public DicegameService() {
		playerDice = new Dice();
		alphaDice = new Dice();
		
		faceValue1 = 0;
		faceValue2 = 0;
		curCell1 = 0;
		curCell2 = 0;
		
		cell = new int[30];

		//������ �ʱ� setting
		for (int i = 0; i < 30; i++) {
			cell[i] = i;
		}

		make_trap_cells();
		make_bonus_cells();
	}
	
	public void init() {
		faceValue1 = 0;
		faceValue2 = 0;
		curCell1 = 0;
		curCell2 = 0;
	}
	
	public WinningStatus roll() {
		//dice�� roll()�� ���� ����
		faceValue1 = playerDice.roll();
		faceValue2 = alphaDice.roll();
		
		//player�� ���� ��ġ
		curCell1 = curCell1 + faceValue1;
		curCell2 = curCell2 + faceValue2;
		
		
		//�� player�� ���ÿ� goal�� �����ߴ��� ���º�
		if(curCell1 >= Goal && curCell2 >= Goal) {
			resultMessage = "Draw";
			
			//���ΰ�ħ�̳� �ڷΰ��� ���� �� �����Ǵ� �� ����
			init();
			
			return WinningStatus.Draw;
		}
		//player�� ���� goal�� �����ߴٸ� player ��
		else if(curCell1 >= Goal && curCell2 < Goal) {
			resultMessage = getPlayerName() + " Wins";
			
			init();
			
			return WinningStatus.Player;
		}
		//alpha�� ���� goal�� �����ߴٸ� alpha ��
		else if(curCell1 < Goal && curCell2 >= Goal) {
			resultMessage = "AlphaDice Wins";
			
			init();
			
			return WinningStatus.AlphaDice;
		}
		else {
			if(curCell1 != cell[curCell1]) {
				curCell1 = cell[curCell1];
			}
			if(curCell2 != cell[curCell2]) {
				curCell2 = cell[curCell2];
			}
			
			return WinningStatus.NotYet;
		}
	}
	
	public void setPlayerName(String name) {
		this.playerName = name;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public String getResultMessage() {
		return resultMessage;
	}
	
	public int getFaceValue1() {
		return faceValue1;
	}

	public int getFaceValue2() {
		return faceValue2;
	}

	public int getCurCellPos1() {
		return curCell1;
	}

	public int getCurCellPos2() {
		return curCell2;
	}
	
	// trap ��ġ
	private void make_trap_cells() {
		cell[10] = 0;
		cell[28] = 0;
		cell[8] = 3;
		cell[15] = 5;
		cell[21] = 12;
		cell[25] = 17;
	}

	// bonus ��ġ
	private void make_bonus_cells() {
		cell[11] = 20;
		cell[26] = 27;
		cell[9] = 14;
		cell[16] = 22;
	}
	
	/*
	public Scores load() {
		try {
			return ScoreDAO.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void save(Scores scores) {
		try {
			ScoreDAO.save(scores);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 */
}
