package com.omniwyse.sms.utils;

import org.springframework.stereotype.Service;

import com.omniwyse.sms.models.Tenants;

@Service
public class LoginResponse {

    private long userId;
    private String username;
    private String userrole;
    private long status;
    private String description;
    private Tenants tenant;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public Tenants getTenant() {
		return tenant;
	}

	public void setTenant(Tenants tenant) {
		this.tenant = tenant;
	}

}
