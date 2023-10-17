package org.example.Abstract;

public class Cat extends DomesticAnimal{
  @Override
  public String getSound() {
    return "Мяу!";
  }

  @Override
  public String getName() {
    return "Мурка";
  }

  @Override
  public int getAge() {
    return 3;
  }
}
