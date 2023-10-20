package org.example.Abstr_Interf1;

public class Main {
  public static void main(String[] args) {
    Transport boat = new Boat(false);
    System.out.println("Является ли транспорт наземным: " + boat.isGround());

    GroundTransport motorcycle = new Motorcycle(true, 2);
    System.out.println("Является ли транспорт наземным: " + motorcycle.isGround());
    System.out.println("Количество колес: " + motorcycle.getWheelsCount());

    GroundTransport car = new Car(true, 4);
    System.out.println("Является ли транспорт наземным: " + car.isGround());
    System.out.println("Количество колес: " + car.getWheelsCount());

  }
}
