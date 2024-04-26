import java.util.*;
public class CalTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        if (money > 50000){
            System.out.print(money*0.1);
        } else{
            System.out.print(money*0.05);
        }
    }
}
