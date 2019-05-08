package com.omniwyse.sms.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dieselpoint.norm.Database;
import com.omniwyse.sms.models.Events;
import com.omniwyse.sms.utils.EventsDTO;

@Service
public class EventsService {

	@Autowired
    private com.omniwyse.sms.db.DatabaseRetrieval retrive;

	private Database db;

    public int postEvent(EventsDTO eventdto, long tenantId) {

        db = retrive.getDatabase(tenantId);

        Events event = new Events();

        Date eventdate = new Date(eventdto.getEventdate());

        event.setChiefguest(eventdto.getChiefguest());
        event.setDescription(eventdto.getDescription());
        event.setEventdate(eventdate);
        event.setEventname(eventdto.getEventname());
        event.setCreatedon(new Timestamp(new Date().getTime()));
        event.setModifiedon(new Timestamp(new Date().getTime()));
        return db.insert(event).getRowsAffected();
    }

    public List<Events> listEvents(long tenantId) {
		db = retrive.getDatabase(tenantId);
        return db.results(Events.class);
	}

    public int deleteEvent(Events event, long tenantId) {

        db = retrive.getDatabase(tenantId);

        return db.delete(event).getRowsAffected();

    }

    public int editEvent(Events event, long tenantId) {

        db = retrive.getDatabase(tenantId);
        Timestamp createdon = db.where("id=?",event.getId()).results(Events.class).get(0).getCreatedon();
        event.setCreatedon(createdon);
        event.setModifiedon(new Timestamp(new Date().getTime()));
        return db.update(event).getRowsAffected();

    }
}
