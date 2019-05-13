package com.omniwyse.sms.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "roles")
public class UserRoles {
    private long id;
    private String role;
    private String description;
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
	public UserRoles() {

    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

