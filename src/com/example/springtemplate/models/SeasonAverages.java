package com.example.springtemplate.models;

@Entity
public class SeasonAverages {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer statid;
  @OneToOne(mappedBy="seasonaverages")
  private Integer playerid;
  private Integer ppg;
  private Integer rpg;
  private Integer apg;

  public Integer getPlayerid() {
    return playerid;
  }

  public void setPlayerid(Integer playerid) {
    this.playerid = playerid;
  }

  public Integer getPpg() {
    return ppg;
  }

  public void setPpg(Integer ppg) {
    this.ppg = ppg;
  }

  public Integer getRpg() {
    return rpg;
  }

  public void setRpg(Integer rpg) {
    this.rpg = rpg;
  }

  public Integer getApg() {
    return apg;
  }

  public void setApg(Integer apg) {
    this.apg = apg;
  }
}
