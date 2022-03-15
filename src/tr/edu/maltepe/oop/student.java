package tr.edu.maltepe.oop;
public class student extends person {
    private int id;
    public student(String name,int age,int id){

        super(name,age);
        this.id=id;
    }

    public String detayGoster(){
        return this.name+"   "+this.age+"    "+this.id;
    }
    public void setId(int id){
        id=this.id;
    }
    public int getId(){
        return this.id;

    }
}
