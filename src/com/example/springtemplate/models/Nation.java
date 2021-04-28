package com.example.springtemplate.models;

import java.util.List;

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
