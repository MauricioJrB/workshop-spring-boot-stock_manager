package workshopmongo.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import workshopmongo.demo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User test1 = new User("1", "Test1", "test1@gmail.com", "123");
		User test2 = new User("2", "Test2", "test2@gmail.com", "456");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(test1, test2));
		
		return ResponseEntity.ok().body(list);
		
	}
}
