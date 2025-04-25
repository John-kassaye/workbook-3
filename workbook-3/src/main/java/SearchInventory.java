import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchInventory {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        readingFile("inventory.csv");
//        displayFile();
//        displayInventory();

//       try(FileWriter fileWriter = new FileWriter("inventory.csv")){
//           fileWriter.write("4567|10' 2x4 (grade B)|9.99");
//           fileWriter.write("1234|Hammer|19.49");
//           fileWriter.write("2345|Box of nails|9.29");
//       } catch (Exception e) {
//           throw new RuntimeException(e);
//       }


    }


    public static void displayInventory(){

//        List<Product> inventory = new ArrayList<>();
        System.out.println("please enter 3 inventories(name:id:price respectively)");
        String name = scanner.nextLine();
        int id = scanner.nextInt();
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("please enter the 2nd one");
        String name2 = scanner.nextLine();
        int id2 = scanner.nextInt();
        int price2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("please enter the 3rd one");
        String name3 = scanner.nextLine();
        int id3 = scanner.nextInt();
        int price3 = scanner.nextInt();

        getInventory(name,id,price);
        getInventory(name2,id2,price2);
        getInventory(name3,id3,price3);


//        inventory.add(new Product(name,id,price));
//        inventory.add(new Product(name2,id2,price2));
//        inventory.add(new Product(name3,id3,price3));
//

//        System.out.println("we carry the following Inventory's: ");
//        for (Product p : inventory){
//            System.out.println( "name: "+p.getName() +" id: "+ p.getId()+" price: " + p.getPrice());
//        }


    }
    public static List<Product> getInventory(String name, int id, int price) {

        List<Product> inventory = new ArrayList<>();

        inventory.add(new Product(name, id, price));

        System.out.println("we carry the following Inventory's: ");
        for (Product p : inventory) {
            System.out.println("name: " + p.getName() + " id: " + p.getId() + " price: " + p.getPrice());
        }
        return inventory;
    }
//        List<Product> inventory = new ArrayList<>();
//        return inventory;
//    }
    public static File displayFile(){
        File file = new File("inventory.csv");
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("4567|10' 2x4 (grade B)|9.99 \n");
            fileWriter.write("1234|Hammer|19.49 \n");
            fileWriter.write("2345|Box of nails|9.29");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return file;
    }
    public static String readingFile(String file){
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
//             line = bufferedReader.readLine();
//            String[] split = line.split("|");
            while ((line = bufferedReader.readLine()) != null){
                String[] split = line.split("\\|");
                System.out.println( "id " + split[0]);
                System.out.println( "name " + split[1]);
                System.out.println( "price " + split[2]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }
}
