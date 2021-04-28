package com.example.springtemplate.DAO;

import com.example.springtemplate.models.Player;
import com.example.springtemplate.models.Rating;
import com.example.springtemplate.repositories.RatingRepository;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RatingDao {
  @Autowired
  RatingRepository repository;

  @GetMapping("/api/ratings/")
  public List<Rating> findAllRatings() {
    return repository.findAllRatings();
  }

  @GetMapping("/api/ratings/{pid}/user/{uid}/create/")
  public Rating createRating(@PathVariable("pid") Integer pid, @PathVariable("uid") Integer uid) {
    return repository.createRating(pid,uid);
  }

  @GetMapping("/api/ratings/{pid}")
  public Rating findRatingByID(@PathVariable("pid") Integer pid) {
    return repository.findRatingByID(pid);
  }

  @GetMapping("/api/ratings/{pid}/user/{uid}/")
  public Rating updateRating(@PathVariable("pid") Integer pid) {
    return repository.updateRating(pid);
  }

  @GetMapping("/api/ratings/{pid}/delete")
  public Boolean deleteRating(@PathVariable("pid") Integer pid) {
    return repository.deleteRating(pid);
  }
}
