package com.example.springboot.playerdb.repository;

import com.example.springboot.playerdb.model.Player;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;


public interface PlayerRepository extends CrudRepository<Player, Integer> {
  /*
  @Query(value = "INSERT INTO Player (team, nationID, firstName, lastName, dob, school)"
      + "VALUES(:team,:nationID,:firstName,:lastName,:dob,:school)",
      nativeQuery = true)
  Player createPlayer(@Param("team") Team team,@Param("nationID") Integer nationID,
      @Param("firstName") String firstName,@Param("lastName") String lastName,@Param("dob") Date dob,
      @Param("school") String school);

  @Query(value = "SELECT FROM Player",
      nativeQuery = true)
  List<Player> findAllPlayers();

  @Query(value = "SELECT p.playerID, p.team, p.nationID, p.firstName, p.lastName, p.dob, p.school"
      + "FROM Player p"
      + "WHERE p.playerID = :playerID",
      nativeQuery = true)
  Player findByID(@Param("playerID") Integer playerID);

  @Query(value = "SET team = :new_team, nationID = :new_nationID, firstName = :new_firstName,"
      + "lastName = :new_lastName, dob = :new_dob, school = :new_school;",
      nativeQuery = true)
  Player updatePlayer(@Param("new_team") Team team, @Param("new_nationID") Integer newNationID,
      @Param("new_firstName") String firstName, @Param("new_lastName") String lastName, @Param("new_dob") Date dob,
      @Param("new_school") String school);

  @Query(value = "DELETE"
      + "FROM Player p"
      + "WHERE p.name =:playerID")
  Boolean deletePlayer(@Param("playerID") Integer playerID);
   */
}
