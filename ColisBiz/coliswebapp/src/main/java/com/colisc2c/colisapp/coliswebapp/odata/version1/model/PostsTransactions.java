package com.colisc2c.colisapp.coliswebapp.odata.version1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the posts_transactions_tbl database table.
 * 
 */
@Entity
@Table(name="posts_transactions_tbl")
@NamedQuery(name="PostsTransactions.findAll", query="SELECT p FROM PostsTransactions p")
public class PostsTransactions implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ID", unique=true, nullable=false)
	private int pkId;

	@Column(nullable=false)
	private int colisID;

	@Column(name="PAYMENT_ID", nullable=false)
	private int paymentId;

	@Column(name="TRIP_ID", nullable=false)
	private int tripId;

	@Column(nullable=false)
	private int userID;

	public PostsTransactions() {
	}

	public int getPkId() {
		return this.pkId;
	}

	public void setPkId(int pkId) {
		this.pkId = pkId;
	}

	public int getColisID() {
		return this.colisID;
	}

	public void setColisID(int colisID) {
		this.colisID = colisID;
	}

	public int getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getTripId() {
		return this.tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}