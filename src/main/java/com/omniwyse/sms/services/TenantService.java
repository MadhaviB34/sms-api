package com.omniwyse.sms.services;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.omniwyse.sms.models.Tenants;

@Service
public class TenantService extends BaseService {

    public List<Tenants> getAllTenants() {
        return getSmsDB().results(Tenants.class);
    }

    public int saveSchool(Tenants school) {
    	school.setCreatedOn(new Timestamp(new Date().getTime()));
    	school.setModifiedOn(new Timestamp(new Date().getTime()));
        return getSmsDB().insert(school).getRowsAffected();
    }

    public Tenants getTenant(String name) {
        return getSmsDB().where("code=?", name.toUpperCase()).first(Tenants.class);
    }

}

