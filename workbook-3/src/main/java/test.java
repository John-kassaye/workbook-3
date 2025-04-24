import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class test {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        System.out.println("What is today's date\n How are u feeling today?");
        String mood = scanner.nextLine();
        String date = scanner.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        try(FileWriter fileWriter = new FileWriter("user's file.txt")){
            fileWriter.write(date);
            fileWriter.write(mood);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try(BufferedReader bufferedReader = new BufferedReader( new FileReader("user's file.txt"))) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null);{
//                if(line.contains(mood)){
//                    System.out.println(mood);
//                }}
//            }catch (IOException e){
//            System.out.println("oppps" + e.getMessage());
//        }





    }
}
