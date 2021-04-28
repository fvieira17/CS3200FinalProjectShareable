package com.example.springtemplate.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Rating {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int ratingid;
  private int playerid;
  private int userid;

  public int getRatingid() {
    return ratingid;
  }

  public void setRatingid(int ratingid) {
    this.ratingid = ratingid;
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