import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<LendingRegistry> lendingRegistries = new ArrayList<>();
        LendingRegistry lendingRegistry = new LendingRegistry();

        while(true) {

            System.out.println("Menu");
            System.out.println("1. Insert data");
            System.out.println("2. Print data");
            System.out.println("3. Delete book data for returned books");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    lendingRegistries.add(lendingRegistry);
                    break;
                case 2:
                    lendingRegistry.printInfo(lendingRegistries);
                    break;
                case 3:
                    lendingRegistry.deleteBookInfo(lendingRegistries);
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}