package com.omniwyse.sms.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dieselpoint.norm.Database;
import com.omniwyse.sms.models.Events;
import com.omniwyse.sms.models.NewsFeed;
import com.omniwyse.sms.utils.NewsFeedDTO;

@Service
public class NewsService {

	@Autowired
    com.omniwyse.sms.db.DatabaseRetrieval retrieve;


	private Database db;

    public int postNews(long tenantId, NewsFeedDTO newsdto) {
        db = retrieve.getDatabase(tenantId);

        NewsFeed news = new NewsFeed();

        Date newsdate = new Date(newsdto.getReleasedate());

        news.setDescription(newsdto.getDescription());
        news.setHeadline(newsdto.getHeadline());
        news.setReleasedate(newsdate);
        news.setCreatedon(new Timestamp(new Date().getTime()));
        news.setModifiedon(new Timestamp(new Date().getTime()));

        return db.insert(news).getRowsAffected();

    }

	public List<NewsFeed> listNews(long tenantId) {
		db = retrieve.getDatabase(tenantId);
		
		return db.results(NewsFeed.class);
	}

	public int deleteNews(NewsFeed newsfeed, long tenantId) {
		db = retrieve.getDatabase(tenantId);
		return db.delete(newsfeed).getRowsAffected();
	}

    public int editNews(NewsFeed newsfeed, long tenantId) {
        db = retrieve.getDatabase(tenantId);
        Timestamp createdon = db.where("id=?",newsfeed.getId()).results(NewsFeed.class).get(0).getCreatedon();
        newsfeed.setCreatedon(createdon);
        newsfeed.setModifiedon(new Timestamp(new Date().getTime()));
        return db.update(newsfeed).getRowsAffected();

    }

}
