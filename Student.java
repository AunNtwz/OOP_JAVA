import java.io.Serializable;

public class Student implements Serializable{
    private String name;
    private String ID;
    private String money;
    public Student(){
        this("", "", "0");
    }
    public Student(String name, String ID, String money){
        this.name = name;
        this.ID = ID;
        this.money = money;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID;
    }
    public void setMoney(String money){
        this.money = money;
    }
    public String getMoney(){
        return money;
    }
}
