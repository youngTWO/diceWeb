package kr.ac.youngseo.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.youngseo.model.WinningStatus;
import kr.ac.youngseo.service.DicegameService;

@Controller
public class DicegameController {
	
	@RequestMapping(value="/dicegame", method = RequestMethod.GET)
	public String dicegame(HttpServletRequest request, HttpServletResponse response) {
		
		String name;
		DicegameService service = (DicegameService) DicegameService.getInstance();
		
		String page;
		
		// 만약 이전에 사용했던 사용자 이름이라면, DB에서 정보 가져오기
		// 신규 플레이어라면 전적 0으로 초기화
		
		if(request.getParameter("roll") != null) {
			service.roll();
		}
		else {
			name= request.getParameter("name");
			service.setPlayerName(name);
		}
		
		request.setAttribute("diceService", service);
		
		return "dicegame";
	}
}
