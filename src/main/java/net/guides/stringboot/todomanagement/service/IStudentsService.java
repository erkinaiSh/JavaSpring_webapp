package net.guides.springboot.todomanagement.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import net.guides.springboot.todomanagement.model.Students;

public interface IStudentsService {

	List<Students> getTodosByUser(String user);

	Optional<Students> getTodoById(long id);

	void updateTodo(Students students);

	void addTodo(String name, String desc, Date targetDate, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Students students);

}