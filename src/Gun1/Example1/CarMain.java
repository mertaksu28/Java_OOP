package Gun1.Example1;

public class CarMain {
    static void main(String[] args) {
        Car car1 = new Car();
        car1.brand="Aston Martin";
        car1.speed=500;

        Car car2 = new Car();
        car2.brand="BMW";
        car2.speed=400;

        Car car3 = new Car();
        car3.brand="Ferrari";
        car3.speed=300;
        car3.speed=350;

        System.out.println(car1.brand);
        System.out.println(car1.speed);

        System.out.println(car2.brand);
        System.out.println(car2.speed);

        System.out.println(car3.brand);
        System.out.println(car3.speed);

        //Only Ferrari's speed changed
        //Every object holding own state

    }
}
