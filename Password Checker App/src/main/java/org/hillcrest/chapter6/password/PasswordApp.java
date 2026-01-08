package org.hillcrest.chapter6.password;

import java.util.Scanner;

public class PasswordApp {
    //main method goes here
    //prompt user for password
    //Check strength
    //Provide user feedback based on the strength
    public class FeedbackGeneratorTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a password here (must follow the criteria): ");
            String password = scanner.nextLine();
        }
}
