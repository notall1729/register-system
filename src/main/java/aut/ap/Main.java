package aut.ap;
import jakarta.transaction.UserTransaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            System.out.println("[L]ogin, [S]ign up");
            String command = scanner.nextLine();

            if (command.equals("L")) {
                login();
            }
            if (command.equals("S")) {
                signUp();
            }
            else {
                System.out.println("Please try again.");
            }

    }

    public static void login(){

    }

    public static void signUp(){
        User user;
        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Age: ");
        Integer age = scanner.nextInt();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("password: ");
        String password = scanner.nextLine();
        if (password.length() < 8){
            System.out.println("Weak password.");
            signUp();
        }

    }
}