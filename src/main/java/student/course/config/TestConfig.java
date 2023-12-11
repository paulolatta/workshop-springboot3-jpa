package student.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import student.course.entities.User;
import student.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "991888888", "123456");
		User u2 = new User(null, "Maria Brown", "maria@gmail.com", "991888888", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
