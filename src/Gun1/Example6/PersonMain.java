package Gun1.Example6;

public class PersonMain {
    static void main(String[] args) {
        Person person1 = new Person();
        person1.name="Mert";
        person1.city="Atlanta";

        Person person2 = new Person();
        person2.name="Bilal";
        person2.city="Marietta";

        Person[] people = {person1,person2};

        people[1].city="Miami";

        for (Person person : people){
            System.out.println(person.city);
        }

        //Objectlerin bagimsiz state i ve gercek hayata modelleme alistirmasi

    }
}
