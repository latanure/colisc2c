package com.colisc2c.colisapp.coliswebapp.model;

public class User {
	
	private long userid;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String ext;
	private String mobile;
	private String status;
	private String profil;
	
	public User(){
		
	}
	public User(long userid, String fname, String lname, String email, String phone, String ext, String mobile, String status, String profile){
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.ext  = ext;
		this.mobile = mobile;
		this.status = status;
		this.profil = profile;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone="
				+ phone + ", ext=" + ext + ", mobile=" + mobile + ", status=" + status + ", profil=" + profil + "]";
	}
	
	
}
