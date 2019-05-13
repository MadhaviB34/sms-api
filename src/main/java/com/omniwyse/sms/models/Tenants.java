package com.omniwyse.sms.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "schools")
public class Tenants {

	private Long id;
	private int statusid = 1;
	private String sname;
 	   private String code;
	private String dbname;
	private String timezone = "india";
        private Date dateofestablishment;
   	 private String url;
    private Timestamp createdOn;
    private Timestamp modifiedOn;
    
    
    public Date getDateofestablishment() {
        return dateofestablishment;
    }

    public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public void setDateofestablishment(Date dateofestablishment) {
        this.dateofestablishment = dateofestablishment;
    }

    public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getStatusid() {
		return statusid;
	}

	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setValues(String sname, String scode, String city, String street, String timezone) {
		this.setDbname(sname);
		this.setCode(scode);
		this.setSname(sname);
        // this.setLocation(city + "," + street);
		this.setTimezone(timezone);
	}

}
