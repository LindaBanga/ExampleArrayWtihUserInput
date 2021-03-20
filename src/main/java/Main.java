/*
     create cars
     view cars
     view specific car
     remove cars
      */

import cars.Car;
import cars.ShowRoom;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    ShowRoom showRoom = new ShowRoom();

    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();


    }

    void showMenu() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("Welcome to show room, chose activity: ");
            System.out.println("1. Add car ");
            System.out.println("2. View all cars");
            System.out.println("3. Show single car ");
            System.out.println("4. Remove car");
            System.out.println("\nEnter Quit to end program...");

            System.out.print("Enter your choice: ");

            userInput = scanner.nextLine();

            switch (userInput) {
                case "quit":
                    System.out.println("Exiting application");
                    break;
                case "1":
                    addCar();
                case "2":
                    viewAllCars();
                    break;
                default:
                    break;
                    case "3";



            }

        } while (!userInput.equalsIgnoreCase("quit"));
        return;

    }

    void addCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Add car ");

        Car car =  new Car();
        System.out.println("Enter name: ");
        car.name = scanner.nextLine();

        System.out.println("Enter manufacturer: ");
        car.manufacturer = scanner.nextLine();

        System.out.println("Enter type: ");
        car.type = scanner.nextLine();

        car.id = UUID.randomUUID();

        String message = showRoom.addCar(car);
        System.out.println(message);

        System.out.print("\n Press enter to continue");
        scanner.nextLine();

    }
    void viewAllCars(){
        ArrayList<Car> allCars = showRoom.getAllCars();

        System.out.println("\n All available cars\n");
        System.out.println("Car name\t  Manufacturer\t Car type");
        for (Car car: allCars){
            System.out.println(car.name + "\t" + car.manufacturer + "\t" + car.type);

        }
    }
}
