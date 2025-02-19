import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for party affiliation
        System.out.print("Enter your party affiliation (D, R, I): ");
        String choice = in.nextLine().toUpperCase(); // Convert input to uppercase

        // Cascaded if-else structure
        if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }

        in.close();
    }
}