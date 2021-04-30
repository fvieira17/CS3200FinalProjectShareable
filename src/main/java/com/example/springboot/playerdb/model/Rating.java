package com.example.springboot.playerdb.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Rating {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer ratingid;
  private Integer playerid;
  private Integer userid;

  public Rating(Integer ratingid, Integer playerid) {
    this.ratingid = ratingid;
    this.playerid = playerid;
  }

  public int getPlayerid() {
    return playerid;
  }
  public void setPlayerid(int playerid) {
    this.playerid = playerid;
  }
  public int getUserid() {
    return userid;
  }
  public void setUserid(int userid) {
    this.userid = userid;
  }
}
