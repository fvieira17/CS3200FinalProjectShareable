package com.example.springboot.playerdb.dao;

import com.example.springboot.playerdb.model.Rating;
import com.example.springboot.playerdb.repository.RatingRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class RatingDao {

  @Autowired
  RatingRepository repository;

  @GetMapping("/api/ratings/")
  public List<Rating> findAllRatings() {
    return (List<Rating>) repository.findAll();
  }

  @GetMapping("/api/ratings/create/{pid}/{uid}/")
  public Rating createRating(@PathVariable("pid") Integer pid, @PathVariable("uid") Integer uid) {
    return repository.save(new Rating(pid,uid));
  }

  @GetMapping("/api/ratings/{rid}")
  public Rating findRatingByID(@PathVariable("rid") Integer rid) {
    return repository.findById(rid).get();
  }

  @GetMapping("/api/ratings/{rid}/{pid}/{uid}/")
  public Rating updateRating(@PathVariable("rid") Integer rid, @PathVariable("pid") Integer pid, @PathVariable("uid") Integer uid) {
    Rating rating = repository.findById(rid).get();
    rating.setPlayerid(pid);
    rating.setUserid(uid);
    return repository.save(rating);
  }

  @GetMapping("/api/ratings/delete/{rid}/")
  public void deleteRating(@PathVariable("rid") Integer rid) {
    repository.deleteById(rid);
  }
}
