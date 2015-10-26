package com.example.helloworld.db;

import com.example.helloworld.core.Category;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by wahyuoi on 10/26/15.
 */
public class CategoryDAO extends AbstractDAO<Category> {
    public CategoryDAO(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
    public List<Category> getAll(){
        return list(criteria());
    }
}
