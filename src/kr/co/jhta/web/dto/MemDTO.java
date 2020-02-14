package kr.co.jhta.web.dto;

public class MemDTO {
	int memno;
	String id;
	String pwd;
	String email;
	String addrs;
	
	public MemDTO() {
		super();
	}

	public MemDTO(int memno, String id, String pwd, String email, String addrs) {
		super();
		this.memno = memno;
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.addrs = addrs;
	}

	public int getMemno() {
		return memno;
	}

	public void setMemno(int memno) {
		this.memno = memno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "MemDTO [memno=" + memno + ", id=" + id + ", pwd=" + pwd + ", email=" + email + ", addrs=" + addrs + "]";
	}
	
	
	
	
}
