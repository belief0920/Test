package kr.co.jhta.web.controller;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import kr.co.jhta.web.dto.MemDTO;

class JoinControllerTest {

	@Test
	void testJoin() {
		JoinController j = new JoinController();
		assertEquals("join", j.join());
	}

	@Test
	void testJoinOk() {
		JoinController j = new JoinController();
		MemDTO dto = new MemDTO();
		
		
		
	}

}
