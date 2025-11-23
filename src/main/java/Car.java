public class Car {

    final String name;
    int speed;
    int distance;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void drive() {
        this.distance = 24 * speed;
    }
}
