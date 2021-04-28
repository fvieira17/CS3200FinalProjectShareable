package com.example.springtemplate.repositories;

import com.example.springtemplate.models.User;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
  @Query("SELECT user FROM User user WHERE userD.username=:username")
  User findUserByUsername(@Param("username") String username);

  @Query("SELECT user FROM User user WHERE userD.username=:username AND user.password=:password")
  User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

  @Query("INSERT INTO DUser (firstName, lastName, username, password, email, dob)\n"
      + "VALUE ()")
  User createUser(@Param("firstName") String firstName, @Param("lastName") String lastName,
      @Param("username") String username, @Param("password") String password,
      @Param("email") String email, @Param("dob") String dob);

  @Query("SELECT * FROM DUser")
  List<User> findAllUsers();

  @Query("SELECT u.firstName, u.lastName, u.username, u.password, u.email, u.dob"
      + "FROM DUser u"
      + "WHERE u.userID = :userID")
  User findUserByID(@Param("userID") Integer userID);

  @Query("UPDATE DUser"
      + "SET firstName = :new_firstName, lastName = :new_lastName, username = :new_username,"
      + "password = :new_password, email = :new_email, dob = :new_dob;")
  User updateUser(@Param("new_firstName") String firstName, @Param("new_lastName") String lastName,
      @Param("new_username") String username, @Param("new_password") String password, @Param("new_email") String email,
      @Param("new_dob") Date dob);

  @Query("DELETE \n"
      + "FROM DUser u\n"
      + "WHERE u.userID = :userID;")
  boolean deleteUser(@Param("userID") Integer userID);
}
