package com.yedam;

public class Member {
	
	private String id;
	private String pw;
	
	
	public Member() {}
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public int hashCode() { //hash코드는 모든시퀀스마다 달라짐 그러니까 아래처럼 따로 지정해줘야 set에서 인식함
//		return super.hashCode();
		return this.id.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if(!(obj instanceof Member)) {
			return false;
		}
		
		Member member = (Member) obj;
		if (this.id.equals(member.id) && pw.equals(member.pw)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
//		return super.toString();
		return "회원아이디 : " + id + "     비밀번호 : " + pw;
	}
	
}
