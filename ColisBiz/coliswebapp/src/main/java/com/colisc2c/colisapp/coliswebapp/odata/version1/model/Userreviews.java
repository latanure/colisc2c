package com.colisc2c.colisapp.coliswebapp.odata.version1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the userreviews_tbl database table.
 * 
 */
@Entity
@Table(name="userreviews_tbl")
@NamedQuery(name="Userreviews.findAll", query="SELECT u FROM Userreviews u")
public class Userreviews implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ID", unique=true, nullable=false)
	private int pkId;

	//bi-directional many-to-one association to Users
	@ManyToOne
	@JoinColumn(name="Parent_id", nullable=false)
	private Users usersTbl;

	public Userreviews() {
	}

	public int getPkId() {
		return this.pkId;
	}

	public void setPkId(int pkId) {
		this.pkId = pkId;
	}

	public Users getUsersTbl() {
		return this.usersTbl;
	}

	public void setUsersTbl(Users usersTbl) {
		this.usersTbl = usersTbl;
	}

}