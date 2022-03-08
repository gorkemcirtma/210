package tr.edu.maltepe.oop;
public class student {
    private String name;
    private int age;


    public student(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String detayGoster(){
        return this.name+"   "+this.age;
    }
}
