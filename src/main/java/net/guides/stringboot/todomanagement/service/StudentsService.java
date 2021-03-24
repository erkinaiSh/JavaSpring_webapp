package net.guides.springboot.todomanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import net.guides.springboot.todomanagement.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.guides.springboot.todomanagement.repository.StudentsRepository;

@Service
public class StudentsService implements IStudentsService {

	@Autowired
	private StudentsRepository studentsRepository;

	@Override
	public List<Students> getTodosByUser(String user) {
		return studentsRepository.findByUserName(user);
	}

	@Override
	public Optional<Students> getTodoById(long id) {
		return studentsRepository.findById(id);
	}

	@Override
	public void updateTodo(Students students) {
		studentsRepository.save(students);
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		studentsRepository.save(new Students(name, desc, targetDate, isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Students> todo = studentsRepository.findById(id);
		if (todo.isPresent()) {
			studentsRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Students students) {
		studentsRepository.save(students);
	}
}