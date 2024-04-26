import java.util.*;

public class even_odd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        while (true){
            int number = input.nextInt();
            if (number == -1){
                break;
            }
            System.out.println(number);
            if (number%2 == 0){
                even += 1;
            }
            else if(number%2 != 0){
                odd += 1;
            }
        }
        System.out.println("Odd number = "+ odd +" and Even number = "+even);
    }
}
