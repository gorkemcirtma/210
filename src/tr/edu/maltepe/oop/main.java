package tr.edu.maltepe.oop;
public class main {
    public static void main(String[] args) {
        prof prof1 = new prof("gorkem", 21,2343);
        prof prof2 = new prof("gorkem", 22,4521);
        prof prof3 = new prof("gorkem", 23,5231);
        student student1 = new student("gizem", 23,3245);
        student student2 = new student("gizem", 24,3254);
        student student3 = new student("gizem", 25,6534);
        System.out.println(prof1.detayGoster());
        System.out.println(prof2.detayGoster());
        System.out.println(prof3.detayGoster());
        System.out.println(student1.detayGoster());
        System.out.println(student2.detayGoster());
        System.out.println(student3.detayGoster());
        System.out.println(prof1.getId());
        System.out.println(prof2.getId());
        System.out.println(prof3.getId());
        System.out.println(student1.getId());
        System.out.println(student2.getId());
        System.out.println(student3.getId());

    }
}