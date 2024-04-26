public class SolutionFinder {
    public static void main(String[] args){
        double a = 4;
        double b = 8;
        double c = 3;
        double solution_x1 = (-b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
        double solution_x2 = (-b-(Math.sqrt((b*b)-4*a*c)))/(2*a);
        System.out.println(solution_x1);
        System.out.print(solution_x2);
    }
}
