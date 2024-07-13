import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        class Car{

            String regNo;
            String model;

            public Car(String regNo, String model) {
                this.regNo = regNo;
                this.model = model;
            }
        }
        Stack<Car> cars = new Stack<>();
        System.out.println("..................................");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cars: ");
        int inputCount = sc.nextInt();
         for(int i=0;i<inputCount;i++) {
             System.out.println("------------------");
             System.out.print("Enter the Registration Number, car model: ");
             String[] carDetails = sc.next().split(",");;
             cars.push(new Car(carDetails[0], carDetails[1]));
         }
        System.out.println("..................................");
         for(Car car: cars) {
             System.out.println(car);
         }
        System.out.println("..................................");
        System.out.println("Removed Stack top");
        System.out.println(cars.pop());
        System.out.println("Removed Stack top");
        System.out.println(cars.pop());
        System.out.println("..................................");
        for(Car car: cars) {
            System.out.println(car);
        }
        System.out.println("..................................");
        System.out.println("Peek element: "+cars.peek());
        System.out.println("..................................");

    }
}