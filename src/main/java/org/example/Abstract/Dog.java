package org.example.Abstract;

public class Dog extends DomesticAnimal{
  @Override
  public String getSound() {
    return "Гав!";
  }

  @Override
  public String getName() {
    return "Шарик";
  }

  @Override
  public int getAge() {
    return 5;
  }
}
