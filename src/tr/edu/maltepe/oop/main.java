package tr.edu.maltepe.oop;
public class main {
    public static void main(String[] args) {
        prof prof1 = new prof("gorkem", 21);
        prof prof2 = new prof("gorkem", 22);
        prof prof3 = new prof("gorkem", 23);
        student student1 = new student("gizem", 23);
        student student2 = new student("gizem", 24);
        student student3 = new student("gizem", 25);
        System.out.println(prof1.detayGoster());
        System.out.println(prof2.detayGoster());
        System.out.println(prof3.detayGoster());
        System.out.println(student1.detayGoster());
        System.out.println(student2.detayGoster());
        System.out.println(student3.detayGoster());
    }
}