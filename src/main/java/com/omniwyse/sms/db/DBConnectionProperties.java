

package com.omniwyse.sms.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBConnectionProperties {

    private final String host, port, user, password;

    @Autowired
    public DBConnectionProperties() {
        if (System.getenv("ischool_db_host") != null) {
            host = System.getenv().getOrDefault("sms_db_host", System.getenv("ischool_db_host"));
            port = System.getenv().getOrDefault("sms_db_port", System.getenv("ischool_db_port"));
            user = System.getenv().getOrDefault("sms_db_user", System.getenv("ischool_db_user"));
            password = System.getenv().getOrDefault("sms_db_password", System.getenv("ischool_db_password"));
        } else {
            host = System.getenv().getOrDefault("sms_db_host", "ls-19723e7c7f1013506ea2ec4ce2605cc78573b4f2.cxmircddsjde.ap-south-1.rds.amazonaws.com");
            port = System.getenv().getOrDefault("sms_db_port", "3306");
            user = System.getenv().getOrDefault("sms_db_user", "ischooladmin");
            password = System.getenv().getOrDefault("sms_db_password", "AdMI%uJKreUsr");
        }
    }

    public String host() {
        return host;
    }

    public String port() {
        return port;
    }

    public String user() {
        return user;
    }

    public String password() {
        return password;
    }
}
