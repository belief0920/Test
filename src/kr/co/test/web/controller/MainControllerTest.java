package kr.co.test.web.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kr.co.jhta.web.controller.MainController;

class MainControllerTest {
	
	@Test
	void testMain() {
		MainController main = new MainController();
		assertEquals("main", main.main());
	}

}
