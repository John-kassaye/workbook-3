import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
//                ArrayList<Product> inventory = getInventory();
//                System.out.println("We carry the following inventory: ");
//                for (int i = 0; i < inventory.size(); i++) {
//                    Product p = inventory.get(i);
//                    System.out.printf("id: %d %s - Price: $%.2f",
//                            p.getId(), p.getName(), p.getPrice());
//                }
//        creatingFile();
        listAllProducts();
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        System.out.println("We carry the following inventory: ");
        inventory.add(new Product("pc", 1, 700));
        inventory.add(new Product("ps", 2, 450));
        inventory.add(new Product("printer", 3, 200));
        inventory.add(new Product("car", 4, 20000));
        inventory.add(new Product("house", 5, 600000));
        return inventory;

    }

    public static void display() {
        for (int i = 0; i < getInventory().size(); i++) {
            System.out.println(getInventory().get(i).getId() + " " + getInventory().get(i).getName());
        }

    }

    public static void creatingFile() {
        try (FileWriter fileWriter = new FileWriter("Inventory.csv", true)) {
            fileWriter.write("4567|10' 2x4 (grade B)|9.99 ");
            fileWriter.write("1234|Hammer|19.49 \n");
            fileWriter.write("2345|Box of nails|9.29");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Product> readingFile() {
        List<Product> products = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Inventory.csv"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split("\\|");
                Product product = new Product(split[1], Integer.parseInt(split[0]), (int) Float.parseFloat(split[2]));
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public static void listAllProducts() {
        List<Product> inventory = readingFile();
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d - %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
}
