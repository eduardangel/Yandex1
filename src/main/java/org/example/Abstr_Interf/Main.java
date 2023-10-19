package org.example.Abstr_Interf;

public class Main {
  public static void main(String[] args) {

    Boat boat = new Boat(false);
    System.out.println("Является ли транспорт наземным: " + boat.isGround());

    Motorcycle motorcycle = new Motorcycle(true,2);
    System.out.println("Является ли транспорт наземным: " + motorcycle.isGround());
    System.out.println("Колличество колес: " + motorcycle.getWheelsCount());

    Car car = new Car(true, 4);
    System.out.println("Является ли транспорт наземным: " + car.isGround());
    System.out.println("Колличество колес: " + car.getWheelsCount());

    Sportcar sportcar = new Sportcar(true, 4);
    System.out.println("Является ли транспорт наземным: " + sportcar.isGround());
    System.out.println("Колличество колес: " + sportcar.getWheelsCount());

  }
}
