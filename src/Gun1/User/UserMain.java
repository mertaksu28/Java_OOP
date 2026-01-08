package Gun1.User;

public class UserMain {
    static void main(String[] args) {
        //👉 Amaç:
        //“Aynı class, farklı insanlar” fikrini gözle görmek
        //State = Bir ogjec tin o andaki verisel durumudur
        /*

        Ali nin yasi; ali objectinin state i
        Velinin yasi; veli abjectinin state i
        Ayse nin objecti; ayse abjectinin state i

        Sadece Ali nin yasini degistirdigimde diger nesnelerin yasinin ayni kalmasinin sebebi:
        age non-static bir field dir, non-static field object e aittir
        her new cagrisi hafizada ayri bir alan olusturur

         */

        User user = new User();
        user.name="Thomas";
        user.age=12;

        User newUser = new User();
        newUser = user;//Object kopyalamaz field kopyalamaz sadece referansi kopyalar

        newUser.name="Jesicca";

        System.out.println(user.name);
        System.out.println(newUser.name);

        User user1 = new User();
        user1.name="Ali";
        user1.age=19;

        User user2 = new User();
        user2.name = "Veli";
        user2.age=20;

        User user3 = new User();
        user3.name="Ayse";
        user3.age=28;

        System.out.println(user1.name);
        System.out.println(user1.age);

        System.out.println(user2.name);
        System.out.println(user2.age);

        System.out.println(user3.name);
        System.out.println(user3.age);

        System.out.println("_________________");

//        User u1 = new User();
//        u1.name = "Thomas";
//        u1.age = 12;
//
//        User u2 = u1;  // Referans kopyası
//
//        u2.name = "Jessica";
//
//        System.out.println("u1.name: " + u1.name); // Jessica
//        System.out.println("u2.name: " + u2.name); // Jessica

        User u1 = new User();
        u1.name = "Ali";

        User u2 = u1;          // Aynı object
        u2 = new User();        // Yeni object oluştur
        u2.name = "Veli";

        System.out.println("u1.name: " + u1.name); // Ali
        System.out.println("u2.name: " + u2.name); // Veli

    }
}
