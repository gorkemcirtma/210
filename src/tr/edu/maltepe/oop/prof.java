package tr.edu.maltepe.oop;
public class prof {
    private String name;
    private int age;
    private String soyad;
    public prof(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String detayGoster(){
        return this.name+"  " +this.age;
    }
}
