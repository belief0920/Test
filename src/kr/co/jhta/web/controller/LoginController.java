package kr.co.jhta.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.web.dao.CommonDAO;
import kr.co.jhta.web.dto.MemDTO;

@Controller
public class LoginController {
	// 자동 의존 주입
	@Autowired
	CommonDAO dao;
	
	
	@GetMapping("login.do")
	public String login() {
		
		return "login";
		
	}
	
	// redirect를 사용하면 조건에 따라 이동
	@PostMapping("login.do")
	public String loginOk(@ModelAttribute("dto")MemDTO dto,
			HttpSession session) {
		
		System.out.println(dto.getId());
		System.out.println(dto.getPwd());
		
		boolean result = dao.isExists(dto.getId(), dto.getPwd());
		
		if(!result) {
			
			return "redirect:login.do";
		}
		
		session.setAttribute("id", dto.getId());
		return "redirect:main.do";
	}
	
	@RequestMapping("logout.do") 
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		
		return "redirect:main.do";
		
	}
}
