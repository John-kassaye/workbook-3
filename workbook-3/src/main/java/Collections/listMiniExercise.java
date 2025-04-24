package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listMiniExercise {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choice;
        do {
            System.out.println("which one do you like to see");
            System.out.println("1: for list of numbers\n2: for list of players" +
                   " \n3: for list of books\n4: Exit");
             choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    displayNumbers();
                    System.out.println("go back to home page(1)\nExit(4)");
                     choice = scanner.nextInt();
                     if (choice == 4){
                         System.out.println("Thank you for using our application!");
                     }
                    break;
                case 2:
                    displayPlayers();
                    System.out.println("go back to home page(1)\nExit(4)");
                    choice = scanner.nextInt();
                    if (choice == 4){
                        System.out.println("Thank you for using our application!");
                    }
                    break;
                case 3:
                    displayBook();
                    System.out.println("go back to home page(1)\nExit(4)");
                    choice = scanner.nextInt();
                    if (choice == 4){
                        System.out.println("Thank you for using our application!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using our application!");
            }
        }while (choice != 4);
//        displayNumbers();
//        displayPlayers();
//        displayBook();


    }

    public static void displayNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(99);
        numbers.add(34);

        // 3 ways of looping
//        for (int num : numbers){
//            System.out.println(num);
//        }

//        for (int i = 0; i < numbers.size();i++){
//            System.out.println(numbers.get(i));
//        }

        int i = 0;
        while(i < numbers.size()){
            System.out.println(numbers.get(i));
            i++;
        }

        int sum = 0 ;
        for (int j : numbers){
            sum+= j;
        }

        System.out.println(sum);
    }


    public static void displayPlayers(){
                List<String> players = new ArrayList<>();
        players.add(" Leo messi ");
        players.add(" Eden Hazard ");
        players.add(" Rooney ");
//        int sth = players.indexOf(" Rooney ");
//        System.out.println(sth);
//        players.remove(2);

        //#3 ways of looping
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }

//        int i = 0;
//        while (i < players.size()){
//            System.out.println(players.get(i));
//            i++;
//        }
//
//        for (String s : players){
//            System.out.println(s);
//        }
//
//        players.add("Eden Hazard");
//        int j = 0;
//        while (j < players.size()) {
//            System.out.println(players.get(j));
//            i++;
//        }
//
//        players.remove("Eden Hazard");
//        while (i < players.size()) {
//            System.out.println(players.get(i));
//            i++;
//        }
    }

    public static void displayBook(){
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("john","java",30);
        Book book2 = new Book("mike","python",12);
        books.add(book1);
        books.add(book2);

        for (Book i : books){
            System.out.println( i.getAuthor() + " wrote " + i.getTitle());
        }
        
    }
}
