package kr.co.jhta.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.jhta.web.dao.CommonDAO;
import kr.co.jhta.web.dto.MemDTO;

@Controller
public class JoinController {
	// 자동 의존 주입 할 것
	@Autowired
	CommonDAO dao;
	
	
	@GetMapping("join.do")
	public String join() {
		
		return "join";
		
	}
	
	@PostMapping("join.do")
	public String joinOk(@ModelAttribute("dto") MemDTO dto) {		
		
		boolean result =dao.insertOne(dto);
		if(!result) {
			return "join";
		}

		return "joinOk";
	}
}
