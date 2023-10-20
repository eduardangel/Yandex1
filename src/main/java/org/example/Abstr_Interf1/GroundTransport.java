package org.example.Abstr_Interf1;

public abstract class GroundTransport implements Transport{

  private final boolean ground;
  private final int wheelsCount;

  public GroundTransport(boolean ground, int wheelsCount) {
    this.ground = ground;
    this.wheelsCount = wheelsCount;
  }

  @Override
  public boolean isGround(){
    return ground;
  }

  public int getWheelsCount(){
    return wheelsCount;
  }
}
