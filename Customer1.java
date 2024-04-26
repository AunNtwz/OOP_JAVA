public class Customer1 {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    public Customer1(){
        this.acct = new Account[5];
    }
    public Customer1(String firstName, String lastName){
        this.acct = new Account[5];
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString(){
        return (firstName+" "+lastName+" has "+numOfAccount+" accounts.");
    }
    public boolean equals(Customer1 c){
        return ((this.firstName.equals(c.firstName)) 
                && this.lastName.equals(c.lastName));
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }
}
