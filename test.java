import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test {
    public static void main(String[] args) {
        File f = new File("Test1.txt");
        try(FileWriter fw = new FileWriter(f)){
            try(BufferedWriter bw = new BufferedWriter(fw)){
                bw.write("Inwza\n");
                bw.write("55+\n");
            }
        } catch (FileNotFoundException ex) {
            return;
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        finally{
            System.out.println("Writer Successful");
        }
        try(FileReader fr = new FileReader(f)){
            try(BufferedReader br = new BufferedReader(fr)){
                String text;
                while((text = br.readLine()) != null){
                System.out.println(text);
            }
            }
        } catch (FileNotFoundException ex) {
            return;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
