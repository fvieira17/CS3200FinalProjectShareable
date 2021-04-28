package com.example.springtemplate.DAO;

import com.example.springtemplate.models.Player;
import com.example.springtemplate.models.Team;
import com.example.springtemplate.repositories.PlayerRepository;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PlayerDao {
  @Autowired
  PlayerRepository repository;
  @GetMapping("/api/players/{pid}/team/{team}/nation/{nation}/firstName/{firstName}/lastName/{lastName}/dob/{dob}/school/{school}/create")
  public Player createPlayer(@PathVariable("pid") Integer id, @PathVariable("team") Team team,
      @PathVariable("nation") Integer nation, @PathVariable("firstName") String firstName,
      @PathVariable("lastName") String lastName, @PathVariable("dob") Date dob, @PathVariable("school") String school) {
    return repository.updatePlayer(team,nation,firstName,lastName,dob);
  }

  @GetMapping("/api/players")
  public List<Player> findAllPlayers(){
    return (List<Player>) repository.findAll();
  }

  @GetMapping("/api/players/{pid}")
  public Player findPlayerByID(
      @PathVariable("pid") Integer id) {
    return repository.findByID(id);
  }

  @GetMapping("/api/players/{pid}/team/{team}/nation/{nation}/firstName/{firstName}/lastName/{lastName}/dob/{dob}/school/{school}")
  public Player updatePlayer(@PathVariable("pid") Integer id, @PathVariable("team") Team team,
      @PathVariable("nation") Integer nation, @PathVariable("firstName") String firstName,
      @PathVariable("lastName") String lastName, @PathVariable("dob") Date dob, @PathVariable("school") String school) {
    return repository.updatePlayer(team,nation,firstName,lastName,dob);
  }

  @GetMapping("/api/players/{pid}/delete")
  public Boolean deletePlayer(@PathVariable("pid") Integer id) {
    return repository.deletePlayer(id);
  }

}
