import java.util.ArrayList;
public class Race {

    public void drive(ArrayList<Car> cars){
        int longDistance= 0;
        Car winner = new Car();

        for (Car car: cars){
            int distance = 24 * car.speed;
            if (distance>longDistance){
                longDistance = distance;
                winner = car;
            }
        }
        System.out.printf("Самая быстрая машина: %s \n", winner.name);
    }
}