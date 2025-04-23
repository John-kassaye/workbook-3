
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileExercise {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        #1
                try(FileWriter fileWriter = new FileWriter("output.txt")){

            fileWriter.write("somethings are going on");
        } catch (IOException e){
            System.out.println("oooo" + e.getMessage());
        }

//        #2
        try(BufferedReader buffer = new BufferedReader(new FileReader("output.txt"))){
            System.out.println(buffer.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        #3
        String [] poem = {"hello","world","System","out","goal"};

        try(FileWriter file = new FileWriter("output2.txt")){
           int i  = 0;
            while(i < poem.length){
                file.write(poem[i]);
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        # 5
        System.out.println("Please write 3 lines ");
        System.out.println("Please write the first line here");
        String line1 = scanner.nextLine();
        System.out.println("Please write the second line here");
        String line2 = scanner.nextLine();
        System.out.println("Please write the third line here");
        String line3 = scanner.nextLine();

        try(FileWriter user = new FileWriter("user.txt");) {
            user.write(line1 + "\n");
            user.write(line2 + "\n");
            user.write(line3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        #5
        try (FileWriter file = new FileWriter("output2.txt", true)) {
            file.write("\n am adding this line\n");
            file.write(" this line");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        #6

        System.out.println("Enter a word");
        String word = scanner.nextLine();

        try(FileWriter user = new FileWriter("user's word.txt")){
            user.write(word);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("output2.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
               if (line.contains(word)) {
                   System.out.println(word);
               }}
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException f){
            System.out.println("hell" + f.getMessage());
        }

//        #7

        book[] book1 = {

                new book("Robert C. Martin","Clean Code"),
                new book("Joshua Bloch","Effective Java"),
                new book("Kathy Sierra","Head First Java")};

        try(FileWriter write = new FileWriter("trying.txt")){
            for(book book : book1){
                write.write(book.getTitle() + "," + book.getAuthor());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}

