package botman.movies.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmailAndPassword(String email, String password); // Add method to find user by email
}
