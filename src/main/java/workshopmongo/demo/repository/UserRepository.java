package workshopmongo.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import workshopmongo.demo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
