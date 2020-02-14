package kr.co.jhta.test.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import kr.co.jhta.web.dao.MemDAO;
import kr.co.jhta.web.dto.MemDTO;

class MemDAOTest {
	MemDAO dao;
	
	
	@Test
	void testMemDAO() {
		dao = new MemDAO();
		
		assertNotNull(dao.conn);		
	}
	@Test
	void testIsExists() {
		dao = new MemDAO();
		assertEquals(true, dao.isExists("root", "root"));
	}
	@Test
	void testInsertOne() {
		dao = new MemDAO();
		MemDTO dto = new MemDTO();
		dto.setId("test");
		dto.setPwd("test");
		dto.setEmail("test@naver.com");
		dto.setAddrs("testAddrs");
		assertEquals(true, dao.insertOne(dto));
	}

}
