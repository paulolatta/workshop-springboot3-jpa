package student.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import student.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
