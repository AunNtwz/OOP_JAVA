import java.util.*;

public class ex11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i=1; i<= number; i++){
            if (i%5 == 0){
                System.out.println("|");
            }else{
                System.out.print("|");
            }
        }
    }
}
