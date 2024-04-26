public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public boolean equals(Employee e){
        return e.name.equals(this.name);
    }
    @Override
    public String toString(){
        return ("My name is "+name+".\nI have "+getEnergy()+" energy left.\n"+
                "I have a balance of "+wallet.getBalance()+" baht.");
    }
    public boolean buyFood(Seller s){
        if (s == null){
            return false;
        }
        else{
            this.eat(s.sell(this));
            return true;
        }
    }
    public void eat(Food f){
        this.energy += Food.getEnergy();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        return nationality;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
}
