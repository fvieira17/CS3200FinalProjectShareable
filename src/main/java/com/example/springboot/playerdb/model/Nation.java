package com.example.springboot.playerdb.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nation")
public class Nation {

  public Integer getNationID() {
    return nationID;
  }

  public void setNationID(Integer nationID) {
    this.nationID = nationID;
  }

  public String getNationName() {
    return nationName;
  }

  public void setNationName(String nationName) {
    this.nationName = nationName;
  }

  private Integer nationID;
  private String nationName;
  private List<Player> players;

  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }
}
