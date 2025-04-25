import java.io.*;
import java.util.Scanner;

public class myProject {
    static Scanner scanner = new Scanner(System.in);

    static class something{
        public void myClass(){
            try(FileWriter fileWriter = new FileWriter("yeah.txt",true)){
                fileWriter.write("""
                   Goldilocks and the Three Bears
                   
                   Once upon a time a girl named Goldilocks lived in
                   a house at the edge of the woods. In those days
                   curls of hair were called "locks." She was
                   "Goldilocks" because golden hair ran down her head
                   and shoulders""");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public void myClass2(){
            try(FileWriter fileWriter = new FileWriter("poem.txt",true)){
                fileWriter.write("""
                        Mary had a little lamb
                        little lamb
                        little lamb
                        Mary had a little lab
                        it's fleece was white as snow""");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
         public void myClass3(){
             try(FileWriter fileWriter = new FileWriter("chelsea.txt",true)){
                 fileWriter.write("""
                         In those days
                         curls of hair were called "locks." She was
                         "Goldilocks" because golden hair ran down her head
                         and shoulders.""");
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }

    }
    public static void main(String[] args) {

//        experiment();
        asking();


    }
    //prompting user
    public static void asking(){
       String answer;
       String choice = "";
        do {
           System.out.println("""
                   which file do want to open 
                    1: for yeah.txt
                    2: for poem.txt
                    3: for chelsea.txt
                    4: for exit
                   """);
            answer = scanner.nextLine();

           switch (answer) {
               case "1":
                   reading1("yeah.txt");
                   System.out.println("""
                           1:Home page
                           2:Exit""");
                   choice = scanner.nextLine();
                   if (choice.equals("2")){
                       System.out.println("bye bye!!");
                   }
                   break;
               case "2":
                   reading2("poem.txt");
                   System.out.println("""
                           1:Home page
                           2:Exit""");
                   choice = scanner.nextLine();
                   if (choice.equals("2")){
                       System.out.println("bye bye!!");
                   }
                   break;
               case "3":
                   reading3("chelsea.txt");
                   System.out.println("""
                           1:Home page
                           2:Exit""");
                   choice = scanner.nextLine();
                   if (choice.equals("2")){
                       System.out.println("bye bye!!");
                   }
                   break;
               case "4":
                   System.out.println("bye bye!!");
           }
       } while (!answer.equals("4") && (!choice.equals("2")));
    }
    public static void experiment(){
        something y = new something();
        y.myClass();

    }
    public static void experiment2(){
        something y = new something();
        y.myClass2();
    }
    public static void experiment3(){
        something y = new something();
        y.myClass3();
    }

    public static void reading1(String file){

        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void reading2(String file){

        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void reading3(String file){

        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
