package org.hillcrest.chapter6.password;

import java.util.Scanner;

/**
 * The setting up for how you can enter the passcode
 */
public class PasswordApp {
    //main method goes here
    //prompt user for password
    //Check strength
    //Provide user feedback based on the strength
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a strong password: ");
        String password = scanner.nextLine();
        int count = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determineStrength(count);

        System.out.println("\nPassword Strength: " + strength + " (" + count + "/5)");
        if(!strength.equals("Strong")){
            System.out.println("Some suggestions to improve your password would be: ");
            System.out.print(FeedbackGenerator.generateFeedback(password));
        }
    }

}
