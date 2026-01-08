package Gun1.Example3;

public class BookMain {
    static void main(String[] args) {

        //Amac new ile yeni object olusturuldugunda eski referansin etkilenmedigini gormek

        Book book1 = new Book();
        book1.title="Birds";
        book1.pageCount=50;

        Book book2 = new Book();
        book2.title="Dogs";
        book2.pageCount=100;

        book2=book1;

        book2= new Book();

        book2.title="Humans";

        System.out.println(book1.title);
        System.out.println(book2.title);


    }
}
