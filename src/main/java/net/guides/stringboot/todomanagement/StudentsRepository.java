package net.guides.springboot.todomanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.guides.springboot.todomanagement.model.Students;

public interface StudentsRepository extends JpaRepository<Students, Long>{
	List<Students> findByUserName(String user);
}
