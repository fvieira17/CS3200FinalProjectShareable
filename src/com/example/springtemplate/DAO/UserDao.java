package com.example.springtemplate.DAO;

import com.example.springtemplate.models.Rating;
import com.example.springtemplate.models.User;
import com.example.springtemplate.repositories.RatingRepository;
import com.example.springtemplate.repositories.UserRepository;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserDao {
  @Autowired
  UserRepository repository;

  @GetMapping("/api/users/")
  public List<User> findAllUsers() {
    return repository.findAllUsers();
  }

  @GetMapping("/api/users/{pid}/user/{uid}/create/")
  public User createUser(@PathVariable("") Integer pid, @PathVariable("uid") Integer uid) {
    return repository.createRating(pid,uid);
  }

  @GetMapping("/api/users/{pid}")
  public User findUserByID(@PathVariable("pid") Integer pid) {
    return repository.findRatingByID(pid);
  }

  @GetMapping("/api/users/{pid}/user/{uid}/")
  public User updateUser(@PathVariable("pid") Integer pid) {
    return repository.updateRating(pid);
  }

  @GetMapping("/api/users/{p")
  public Boolean deleteUser(@PathVariable("pid") Integer pid) {
    return repository.deleteRating(pid);
  }
}
