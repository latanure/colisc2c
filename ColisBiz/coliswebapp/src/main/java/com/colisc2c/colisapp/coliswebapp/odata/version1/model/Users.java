package com.colisc2c.colisapp.coliswebapp.odata.version1.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the users_tbl database table.
 * 
 */
@Entity
@Table(name="users_tbl")
@NamedQuery(name="Users.findAll", query="SELECT u FROM Users u")
public class Users implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ID", unique=true, nullable=false)
	private int pkId;

	@Column(nullable=false, length=50)
	private String email;

	@Column(nullable=false, length=4)
	private String ext;

	@Column(nullable=false, length=50)
	private String fname;

	@Column(nullable=false, length=50)
	private String lname;

	@Column(nullable=false, length=16)
	private String mobile;

	@Column(nullable=false, length=16)
	private String phone;

	@Column(nullable=false, length=20)
	private String profile;

	@Column(nullable=false, length=1)
	private String status;

	//bi-directional many-to-one association to Userreviews
	@OneToMany(mappedBy="usersTbl")
	private List<Userreviews> userreviewsTbls;

	public Users() {
	}

	public int getPkId() {
		return this.pkId;
	}

	public void setPkId(int pkId) {
		this.pkId = pkId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExt() {
		return this.ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Userreviews> getUserreviewsTbls() {
		return this.userreviewsTbls;
	}

	public void setUserreviewsTbls(List<Userreviews> userreviewsTbls) {
		this.userreviewsTbls = userreviewsTbls;
	}

	public Userreviews addUserreviewsTbl(Userreviews userreviewsTbl) {
		getUserreviewsTbls().add(userreviewsTbl);
		userreviewsTbl.setUsersTbl(this);

		return userreviewsTbl;
	}

	public Userreviews removeUserreviewsTbl(Userreviews userreviewsTbl) {
		getUserreviewsTbls().remove(userreviewsTbl);
		userreviewsTbl.setUsersTbl(null);

		return userreviewsTbl;
	}

}