package com.omniwyse.sms.models;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "UserRoleMaintain")
public class UserRoleMaintain {
    private long id;
    private long userid;
    private long roleid;
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

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public long getRoleid() {
        return roleid;
    }

    public void setRoleid(long roleid) {
        this.roleid = roleid;
    }

}
