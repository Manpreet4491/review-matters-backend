package botman.movies.user;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class User {

    private String id;

    @NotBlank(message = "FirstName is required")
    private String firstName;
    
    @NotBlank(message = "LastName is required")
    private String lastName;
    
    @NotBlank(message = "Password is required")
    private String password;
    
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email; // New field for email

    // Constructor
    public User() {
    }

    // Getters and setters for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Getter and settres for firstname
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getters and setters for Lastname
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getters and setters for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getters and setters for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
