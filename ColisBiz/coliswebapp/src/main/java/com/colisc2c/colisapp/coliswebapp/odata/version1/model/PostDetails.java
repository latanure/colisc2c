package com.colisc2c.colisapp.coliswebapp.odata.version1.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the post_details_tbl database table.
 * 
 */
@Entity
@Table(name="post_details_tbl")
@NamedQuery(name="PostDetails.findAll", query="SELECT p FROM PostDetails p")
public class PostDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PK_ID", unique=true, nullable=false)
	private int pkId;

	@Column(name="PARENT_ID", nullable=false)
	private int parentId;

	public PostDetails() {
	}

	public int getPkId() {
		return this.pkId;
	}

	public void setPkId(int pkId) {
		this.pkId = pkId;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

}