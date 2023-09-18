import java.util.Scanner;

public class CoffeeMenu {
    public static void main(String[] args) {

        Coffee[] menu = {
                new Coffee("Espresso", "Strong and concentrated coffee", 280),
                new Coffee("Latte", "Espresso with steamed milk", 390),
                new Coffee("Cappuccino", "Espresso with foamed milk", 250),
                new Coffee("Mocha", "Espresso with chocolate and steamed milk", 295)
        };

        Scanner scanner = new Scanner(System.in);
        boolean validChoice = false;

        while (!validChoice) {

            System.out.println("Coffee Menu:");
            System.out.println("------------------------------------------------------");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i].getName());
            }

            System.out.println();
            System.out.print("Enter the number of the coffee you'd like to order: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= menu.length) {
                validChoice = true;
                Coffee selectedCoffee = menu[choice - 1];
                System.out.println("--------------------------------------------------");
                System.out.println("You've selected: " + selectedCoffee.getName());
                System.out.println("Description: " + selectedCoffee.getDescription());
                System.out.println("Price: " + selectedCoffee.getPrice() + " Pesos");
                System.out.println("Thank you for ordering!");
            } else {
                System.err.print("Invalid choice. Please select a valid coffee. :)");
                System.out.println();
            }
        }
    }
}