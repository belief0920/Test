package kr.co.jhta.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.jhta.web.dto.MemDTO;

public class MemDAO implements CommonDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.35:1521:orcl";
	String user = "scott";
	String password = "tiger";
	public Connection conn = null;
	PreparedStatement pstmt = null;
	StringBuffer sb = new StringBuffer();
	ResultSet rs = null;
	
	public MemDAO() {
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : "+conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 오류");
			e.printStackTrace();
		}
		
		
	}
	
	
	@Override
	public boolean isExists(String id, String pw) {
		sb.setLength(0);
		sb.append("select * ");
		sb.append("from mem ");
		sb.append("where id = ? and pwd = ?");
		
		boolean result = false;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			result = rs.next();
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	@Override
	public boolean insertOne(MemDTO dto) {
		sb.setLength(0);
		sb.append("insert into mem ");
		sb.append("values (mem_memno_seq.nextval, ?, ?, ?, ?) ");
		
		
		boolean result = false;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getAddrs());
			pstmt.executeUpdate();
			
			sb.setLength(0);
			sb.append("select * ");
			sb.append("from mem ");
			sb.append("where id = ? and pwd = ? and email = ? and addrs = ?");
			
			
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getAddrs());
			
			rs = pstmt.executeQuery();
			
			result = rs.next();
			System.out.println(result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			return result;
		
		
	}
	
}
