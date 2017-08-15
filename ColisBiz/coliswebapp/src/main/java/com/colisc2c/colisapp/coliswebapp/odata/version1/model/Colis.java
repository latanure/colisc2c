package com.colisc2c.colisapp.coliswebapp.odata.version1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the colis_tbl database table.
 * 
 */
@Entity
@Table(name="colis_tbl")
@NamedQuery(name="Colis.findAll", query="SELECT c FROM Colis c")
public class Colis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ID", unique=true, nullable=false)
	private int pkId;

	public Colis() {
	}

	public int getPkId() {
		return this.pkId;
	}

	public void setPkId(int pkId) {
		this.pkId = pkId;
	}

}