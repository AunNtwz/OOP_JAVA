import java.util.*;

public class CalSalary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        int working_days = input.nextInt();
        int absent_days = input.nextInt();
        double weight = input.nextDouble();
        int salary = 0;
        if (age >= 21 || age <= 30){
            salary = (working_days*300) - (absent_days*50);
        } else if (age >= 31 || age <= 40){
            salary = (working_days*500) - (absent_days*50);
        } else if (age >= 41 || age <= 50){
            salary = (working_days*1000) - (absent_days*25);
        } else if (age >= 51 || age <= 60){
            salary = (working_days*3000);
        }
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        if (weight >= 10 || weight <= 60){
            salary += 5000;
        } else if (weight >= 61 || weight <= 90){
            salary += (5000-(weight-60)*10);
        }
        System.out.print("Your salary and bonus is " + salary + " Baht");
    }
}
