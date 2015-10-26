package com.example.helloworld.resources;

import com.example.helloworld.db.CategoryDAO;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by wahyuoi on 10/26/15.
 */
@Path("category")
@Produces(MediaType.APPLICATION_JSON)
public class CategoryResource {
    private final CategoryDAO categoryDAO;

    public CategoryResource(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @GET
    @UnitOfWork
    public Response getAll(){
        return Response.ok(categoryDAO.getAll()).build();
    }
}
