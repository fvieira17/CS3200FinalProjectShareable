package com.example.springboot.playerdb.dao;

import com.example.springboot.playerdb.model.User;
import com.example.springboot.playerdb.repository.UserRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserDao {
  @Autowired
  UserRepository repository;

  @GetMapping("/api/users/")
  public List<User> findAllUsers() {
    return (List<User>) repository.findAll();
  }

  @GetMapping("/api/users/{uid}")
  public User findUserByID(@PathVariable("uid") Integer uid) {
    return repository.findById(uid).get();
  }

  @GetMapping("/api/users/create/{username}/{password}/{firstName}/{lastName}/{email}/{dob}")
  public User createUser(@PathVariable("username") String username,
      @PathVariable("password") String password, @PathVariable("firstName") String firstName,
      @PathVariable("lastName") String lastName, @PathVariable("email") String email,
      @PathVariable("dob") Date dob) {
    return repository.save(new User(username,password,firstName,lastName,email,dob));
  }

  @GetMapping("/api/users/{uid}/{username}/{password}/{firstName}/{lastName}/{email}/{dob}")
  public User updateUser(@PathVariable("uid") Integer uid, @PathVariable("username") String username,
      @PathVariable("password") String password, @PathVariable("firstName") String firstName,
      @PathVariable("lastName") String lastName, @PathVariable("email") String email,
      @PathVariable("dob") Date dob) {
    User user = repository.findById(uid).get();
    user.setUsername(username);
    user.setPassword(password);
    user.setFirstName(firstName);
    user.setLastName(lastName);
    user.setEmail(email);
    user.setDob(dob);
    return repository.save(user);
  }

  @GetMapping("/api/users/{uid}")
  public void deleteUser(@PathVariable("uid") Integer uid) {
    repository.deleteById(uid);
  }
}
