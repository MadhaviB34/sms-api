package com.omniwyse.sms.models;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
		
@Table(name = "grades")
public class Grades  {

	private long id;
	private long gradenumber;
	private String gradename;
	private String syllabustype;
	private Timestamp createdon;
	private Timestamp modifiedon;
	
	
	public Timestamp getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Timestamp createdon) {
		this.createdon = createdon;
	}
	
	public Timestamp getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Timestamp modifiedon) {
		this.modifiedon = modifiedon;
	}
	
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getGradenumber() {
		return gradenumber;
	}

	public void setGradenumber(long gradenumber) {
		this.gradenumber = gradenumber;
	}

	public String getGradename() {
		return gradename;
	}

	public void setGradename(String gradename) {
		this.gradename = gradename;
	}

	public String getSyllabustype() {
		return syllabustype;
	}

	public void setSyllabustype(String syllabustype) {
		this.syllabustype = syllabustype;
	}

}
