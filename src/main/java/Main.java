import java.util.Scanner;
public class Main {
    void main() {
        Scanner input = new Scanner(System.in);

        int MAXSPEED = 250;
        int MINSPEED = 0;
        int COUNTOFCARS = 3;
        int maxDistance = 0;
        Car winner = new Car(null, 0);

        for (int i = 0; i < COUNTOFCARS; i++) {
            System.out.println("Введите имя машины:");
            Car car = new Car(input.next(), 0);
            while (true) {
                System.out.printf("Введите скорость машины - просто напишите целое число от %s до %s включительно: \n", MINSPEED + 1, MAXSPEED);
                if (input.hasNextInt()) {
                    car.speed = input.nextInt();
                    if (car.speed > MINSPEED && car.speed <= MAXSPEED) {
                        break;
                    } else {
                        System.out.println("Скорость, которую ты ввел, находится в неправильном диапазоне. Попробуй еще раз");
                    }
                } else {
                    System.out.println("Ты ввел не целое число или не число вовсе. Попробуй еще раз");
                    input.next();
                }

            }
            car.drive();
            if (maxDistance < car.distance) {
                maxDistance = car.distance;
                winner = car;
            }

        }
        input.close();
        System.out.printf("Самая быстрая машина: %s \n", winner.name);
    }
}