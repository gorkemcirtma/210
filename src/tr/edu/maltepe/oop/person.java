package tr.edu.maltepe.oop;

public class person {
    protected String name;
    protected int age;


    public person(String name,int age){
        this.name=name;
        this.age=age;

    }
    public String detayGoster(){
        return this.name+"   "+this.age;
    }


}

