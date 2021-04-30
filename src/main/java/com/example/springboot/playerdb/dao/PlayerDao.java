package com.example.springboot.playerdb.dao;

import com.example.springboot.playerdb.model.Player;
import com.example.springboot.playerdb.model.Team;
import com.example.springboot.playerdb.repository.PlayerRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class PlayerDao {
  @Autowired
  PlayerRepository repository;
  @GetMapping("/api/players/create/{pid}/{team}/{nation}/{firstName}/{lastName}/{dob}/{school}")
  public Player createPlayer(@PathVariable("pid") Integer id,
      @PathVariable("team") Team team, @PathVariable("nation") Integer nation,
      @PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName,
      @PathVariable("dob") Date dob, @PathVariable("school") String school) {
    return repository.save(new Player(nation,firstName,lastName,dob,school,team));
  }

  @GetMapping("/api/players")
  public List<Player> findAllPlayers(){
    return (List<Player>) repository.findAll();
  }

  @GetMapping("/api/players/{pid}")
  public Player findPlayerByID(
      @PathVariable("pid") Integer id) {
    return repository.findById(id).get();
  }

  @GetMapping("/api/players/update/{pid}/{team}/{nation}/{firstName}/{lastName}/{dob}/{school}")
  public Player updatePlayer(@PathVariable("pid") Integer id, @PathVariable("team") Team team,
      @PathVariable("nation") Integer nation, @PathVariable("firstName") String firstName,
      @PathVariable("lastName") String lastName, @PathVariable("dob") Date dob, @PathVariable("school") String school) {
    Player player = repository.findById(id).get();
    player.setFirstName(firstName);
    player.setLastname(lastName);
    player.setNationid(nation);
    player.setDob(dob);
    player.setTeam(team);
    return repository.save(player);
  }

  @GetMapping("/api/players/delete/{pid}")
  public void deletePlayer(@PathVariable("pid") Integer id) {
    repository.deleteById(id);
  }
}
