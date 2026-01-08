package Gun1.Example2;

public class DogMain {
    static void main() {
        Dog dog1 = new Dog();
        dog1.name="Niko";
        dog1.age=2;

        Dog dog2 = new Dog();
        dog2.name="Karabas";
        dog2.age=4;

        dog2=dog1;//Dog2 showing dog1 object's reference(Dog2 artik dog1 objectine isaret ediyor
        //Dog2 doesnt have reference anymore and GC is gonnna clean dog2 reference

        dog2.name="Simba";

        System.out.println(dog1.name);
        System.out.println(dog2.name);


    }
}
