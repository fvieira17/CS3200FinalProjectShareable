package com.example.springboot.playerdb.repository;

import com.example.springboot.playerdb.model.Rating;
import org.springframework.data.repository.CrudRepository;


public interface RatingRepository extends CrudRepository<Rating, Integer> {

  /*
  @Query(value = "INSERT INTO Rating (playerID, userID) VALUES (:playerID,:userID)")
  Rating createRating(@Param("playerID") Integer playerID, @Param("userID") Integer userID);

  @Query(value = "SELECT * FROM Rating; ")
  List<Rating> findAllRatings();

  @Query(value = "SELECT r.playerID, r.userID FROM Rating r WHERE r.playerID = :playerID")
  Rating findRatingByID(@Param("playerID") Integer playerID);

  @Query(value = "UPDATE Rating * SET playerID = :new_playerID")
  Rating updateRating(@Param("new_playerID") Integer playerID);

  @Query(value = "DELETE * FROM Rating r * WHERE r.playerID = :playerID")
  Boolean deleteRating(@Param("playerID") Integer playerID);
   */
}
