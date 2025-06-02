package aut.ap;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
        
    }
}