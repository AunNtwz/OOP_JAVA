import java.util.*;

public class bank {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        char type = input.next().charAt(0);
        if (type == 'A'){
            System.out.print((money*0.015)+money);
        } else if (type == 'B'){
            System.out.print((money*0.02)+money);
        } else if (type == 'C'){
            System.out.print((money*0.015)+money);
        } else if (type == 'X'){
            System.out.print((money*0.05)+money);
        }
    }
}
