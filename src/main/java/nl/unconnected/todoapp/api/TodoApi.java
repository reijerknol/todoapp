package nl.unconnected.todoapp.api;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.unconnected.todoapp.models.TodoModel;

@Path("todo")
public class TodoApi {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public TodoModel getTodoModel() {
		TodoModel todootje = new TodoModel(1, "boodschappen doen", "huishoudelijk", new Date());
		
		return todootje;
	}
	
	
}
