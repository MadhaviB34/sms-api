package com.omniwyse.sms.models;



import java.sql.Timestamp;

import java.util.Date;



import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.Table;



@Table(name ="periods")

public class Periods {

	

	private Long id;

	

	private Long period_type_id;

	

	private Long period_number;

	

	private Long periodfrom;

	

	private Long periodto;



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

	public Long getPeriod_type_id() {

		return period_type_id;

	}



	public void setPeriod_type_id(Long period_type_id) {

		this.period_type_id = period_type_id;

	}



	public Long getPeriod_number() {

		return period_number;

	}



	public void setPeriod_number(Long period_number) {

		this.period_number = period_number;

	}



	public Long getPeriodfrom() {

		return periodfrom;

	}



	public void setPeriodfrom(Long periodfrom) {

		this.periodfrom = periodfrom;

	}



	public Long getPeriodto() {

		return periodto;

	}



	public void setPeriodto(Long periodto) {

		this.periodto = periodto;

	}



	

	

}
