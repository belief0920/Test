package kr.co.jhta.web.dao;

import kr.co.jhta.web.dto.MemDTO;

public interface CommonDAO {
	public boolean isExists(String id, String pw);
	public boolean insertOne(MemDTO dto);
}
