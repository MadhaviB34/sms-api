package com.omniwyse.sms.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="academicyears")
public class AcademicYears {
	private Long id;
	private Long passingyear;
	private Date academicyearstarting;
	private Date academicyearending;
	private long active;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPassingyear() {
		return passingyear;
	}
	public void setPassingyear(Long passingyear) {
		this.passingyear = passingyear;
	}
	
	public Date getAcademicyearstarting() {
		return academicyearstarting;
	}
	public void setAcademicyearstarting(Date academicyearstarting) {
		this.academicyearstarting = academicyearstarting;
	}
	public Date getAcademicyearending() {
		return academicyearending;
	}
	public void setAcademicyearending(Date academicyearending) {
		this.academicyearending = academicyearending;
	}
	public long getActive() {
		return active;
	}
	public void setActive(long active) {
		this.active = active;
	}

}