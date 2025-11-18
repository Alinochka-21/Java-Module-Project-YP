import java.util.ArrayList;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());

        System.out.println("Привет! Сейчас тебе надо ввести данные о трех машинах, просто следуй инструкциям :)");

        for (Car car : cars) {
            System.out.println("Введите имя машины:");
            car.name = input.next();
            while (true) {
                System.out.println("Введите скорость машины - просто напишите целое число от 1 до 250 включительно:");
                if (input.hasNextInt()) {
                    car.speed = input.nextInt();
                    if (car.speed > 0 && car.speed <= 250) {
                        break;
                    } else {
                        System.out.println("Скорость, которую ты ввел, находится в неправильном диапазоне. Попробуй еще раз");
                    }
                } else{
                    System.out.println("Ты ввел не целое число или не число вовсе. Попробуй еще раз");
                    input.next();
                }

            }
        }
        input.close();

        Race winner = new Race();
        winner.drive(cars);
    }


}