package com.example.springboot.playerdb.model;

import java.util.Date;
import javax.persistence.*;
import java.util.List;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String username;
  private String password;
  private String firstName;
  private String lastName;
  private String email;
  private Date dob;
  @OneToMany(mappedBy="user")
  private List<Rating> ratings;

  public User(String username, String password, String firstName, String lastName, String email, Date dob) {
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.dob = dob;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public List<Rating> getRatings() {
    return ratings;
  }

  public void setRatings(List<Rating> ratings) {
    this.ratings = ratings;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void updateUser(User user) throws NullPointerException{
    if (user == null) {
      throw new NullPointerException("User object must not be null");
    }
    if (user.password != null) {
      this.password = user.password;
    }
    if (user.firstName != null) {
      this.firstName = user.firstName;
    }
    if (user.lastName != null) {
      this.lastName = user.lastName;
    }
    if (user.email != null) {
      this.email = user.email;
    }
    if(user.dob != null) {
      this.dob = user.dob;
    }
  }
}