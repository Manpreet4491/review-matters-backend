package botman.movies.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/v1/login")
    public ResponseEntity<User> loginUser(@RequestBody User user) {
        User existingUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
       
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok(existingUser);
        } 
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null); // Handle invalid credentials
    }
}
