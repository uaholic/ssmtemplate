package com.gyq.pojo;

public class UserBean {
	private int uid;
	private String uname;
	private String pwd;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public boolean isNotNullOrEmpty() {
		return!(pwd==null||uname==null||"".equals(pwd.trim())||"".equals(uname.trim()));
	}

}
