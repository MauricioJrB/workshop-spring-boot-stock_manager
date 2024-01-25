package workshopmongo.demo.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import workshopmongo.demo.domain.User;
import workshopmongo.demo.repository.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User joao = new User(null, "João", "joao@gmail.com", "12333");
		User maria = new User(null, "Maria", "maria@gmail.com", "45666");
		User carlos = new User(null, "Carlos", "carlos@gmail.com", "78999");
	
		userRepository.saveAll(Arrays.asList(joao, maria, carlos));
	}
}
