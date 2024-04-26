public class ExceptionDemo {
    public static void main(String[] args){
        try {
            double num_a = Double.parseDouble(args[0]);
            double num_b = Double.parseDouble(args[1]);
            double num_c = Double.parseDouble(args[2]);
            double num_sqrt = Math.sqrt((num_b*num_b)-(4*num_a*num_c));
            double var_x1 = ((-num_b)+(num_sqrt))/(2*num_a);
            double var_x2 = ((-num_b)-(num_sqrt))/(2*num_a);
            System.out.println("x1: "+var_x1);
            System.out.println("x2: "+var_x2);
        }catch (NumberFormatException e){
            System.out.println("Please input data in number format only.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}
