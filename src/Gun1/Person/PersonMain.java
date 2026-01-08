package Gun1.Person;

import Gun1.User.User;

public class PersonMain {
    static void main(String[] args) {

        Person person1 = new Person();
        person1.name="Ali";
        person1.city="New York";

        Person person2 = new Person();
        person2.name="Veli";
        person2.city="New Jersey";
        person2.city="Los Angelos";

        Person person3 = new Person();
        person3.name="Ayse";
        person3.city="Ohio";

        System.out.println(person1.name);
        System.out.println(person1.city);

        System.out.println(person2.name);
        System.out.println(person2.city);
        //Veli nin sehrini degistirdigimde digerlerinin etkilenmemesinin sebebi hepsinin birbirlerinden farkli statelere sahip olmasi
        //Bu bilgiler class da tutulmuyor nesne de tutuluyor yani object de

        System.out.println(person3.name);
        System.out.println(person3.city);

        System.out.println("______________________");


        Person p1 = new Person();
        p1.name = "Ali";
        p1.age = 20;

        Person p2 = new Person();
        p2.name = "Veli";
        p2.age = 25;

        Person p3 = new Person();
        p3.name = "Ayşe";
        p3.age = 30;

        // Console
        System.out.println(p1.name + " : " + p1.age);
        System.out.println(p2.name + " : " + p2.age);
        System.out.println(p3.name + " : " + p3.age);

        // Sadece p1 değişiyor
        p1.age = 21;
        System.out.println("Sonra...");
        System.out.println(p1.name + " : " + p1.age);
        System.out.println(p2.name + " : " + p2.age);


    }
}
