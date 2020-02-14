package kr.co.test.web.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.co.jhta.web.dao.MemDAO;
import kr.co.jhta.web.dto.MemDTO;

class MemDAOTest {

	MemDAO dao;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	// 테스트를 하는 대상
	@Test
	void testMemDAO() {
		dao = new MemDAO();

		// 나는 이값이 널이 아니라고 단정할거야
		// dao의 기본생성자호출시 connection 이 잘 생성되는 것을 알 수 있음
		// DB가 바뀌거나 버젼이 바꾸면 fail이 뜸
		// 에러와 원인을 찾는데 시간이 더 적게 걸림.
		// 원칙을 만든나는 크게 신경 쓰지 않음
		// 테스트는 다른 사람이 실행
		assertNotNull(dao.conn);
		
	}

	// 이런 아이디와 패스워드가 존재하는 지 테스트
	@Test
	void testIsExists() {
		dao = new MemDAO();
		
		// 이런 애가 있으면 true를 리턴 할거고 같다면 테스트가 잘 된 거임
		assertEquals(true, dao.isExists("aaa", "bbb"));
	}

	@Test
	void testInsertOne() {
		dao = new MemDAO();
		assertEquals(true, dao.insertOne(new MemDTO(124,"aaa", "aaa", "a@A", "asd")));
	}

}
