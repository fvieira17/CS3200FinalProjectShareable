package com.example.springboot.playerdb.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;
  private Integer nationid;
  private String firstName;
  private String lastname;
  private Date dob;
  private String school;
  private Team team;

  public Player(Integer nationid, String firstName,
      String lastname, Date dob, String school, Team team) {
    this.nationid = nationid;
    this.firstName = firstName;
    this.lastname = lastname;
    this.dob = dob;
    this.school = school;
    this.team = team;
  }

  public Integer getNationid() {
    return nationid;
  }

  public void setNationid(Integer nationid) {
    this.nationid = nationid;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }
}
