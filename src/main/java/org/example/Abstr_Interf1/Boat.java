package org.example.Abstr_Interf1;

public class Boat implements Transport{

  public boolean ground;

  public Boat(boolean ground) {
    this.ground = ground;
  }

  @Override
  public boolean isGround() {
    return false;
  }
}
