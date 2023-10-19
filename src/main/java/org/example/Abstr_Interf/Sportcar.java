package org.example.Abstr_Interf;

public class Sportcar implements Transport{

  private final boolean ground;
  private final int wheelsCount;

  public Sportcar(boolean ground, int wheelsCount) {
    this.ground = ground;
    this.wheelsCount = wheelsCount;
  }

  @Override
  public boolean isGround() {
    return ground;
  }
  public int getWheelsCount() {
    return wheelsCount;
  }
}
