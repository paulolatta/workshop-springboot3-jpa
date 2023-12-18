package student.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import student.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
