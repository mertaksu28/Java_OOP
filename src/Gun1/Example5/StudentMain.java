package Gun1.Example5;

public class StudentMain {
    static void main(String[] args) {

        Student student1 = new Student();
        student1.name="Mert";
        student1.grade=90;

        Student student2 = new Student();
        student2.name="Bilal";
        student2.grade=85;

        Student student3 = new Student();
        student3.name="Hasan";
        student3.grade=92;

        Student student4 = new Student();
        student4.name="Ayse";
        student4.grade=45;

        Student student5 = new Student();
        student5.name="Ismail";
        student5.grade=34;

        Student[] students = {student1,student2,student3,student4,student5};

        students[1].grade=100;

        for (Student student : students){
            System.out.println(student.grade);
        }

        //Amac: Array uzerinden objectleri yonetmek ve bagimsiz state i anlamak

    }
}
