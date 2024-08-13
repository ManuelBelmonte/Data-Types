import java.util.Scanner;

public class Chatboot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = scanner.nextLine();

        System.out.println("\nHi " + name + " I'm Javabot. Where are you from");
        String live = scanner.nextLine();

        System.out.println("\nI hear it's beautiful at " + live + "! I'm from a place called Orcale");

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm " + (400 / age) + " times older than you");

        System.out.print("Enough about me. What's your favorite language?");
        scanner.nextLine();
        String program = scanner.nextLine();

        System.out.println("\n" + program + " Is a good programming language!");

        scanner.close();

    }
}
