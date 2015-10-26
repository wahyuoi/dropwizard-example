package com.example.helloworld.db;

import com.example.helloworld.core.Leaderboard;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by wahyuoi on 10/26/15.
 */
public class LeaderboardDAO extends AbstractDAO<Leaderboard> {
    public LeaderboardDAO(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    public List<Leaderboard> getAll(){
        return list(criteria());
    }
}
