package com.colisc2c.colisapp.coliswebapp.odata.version1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the payment_tbl database table.
 * 
 */
@Entity
@Table(name="payment_tbl")
@NamedQuery(name="Payment.findAll", query="SELECT p FROM Payment p")
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ID", unique=true, nullable=false)
	private int pkId;

	@Column(nullable=false)
	private int userid;

	public Payment() {
	}

	public int getPkId() {
		return this.pkId;
	}

	public void setPkId(int pkId) {
		this.pkId = pkId;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}