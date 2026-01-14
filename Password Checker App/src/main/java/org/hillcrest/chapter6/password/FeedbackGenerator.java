package org.hillcrest.chapter6.password;

/**
 * class to give the feedback of how good your code is and returns the feedback
 */
public class FeedbackGenerator {
    public static String generateFeedback(String password){
        String feedback = "";

        boolean hasAnUpperCase = false;
        boolean hasALowerCase = false;
        boolean hasAtLeastOneNumber = false;
        boolean hasASpecialCharacter = false;
        String specialCharacters = "!@#$%^&*()-+=";

        if(password.length()<8){
            feedback += "Increase the length to at least 8 characters.\n";
        }

        for (int i = 0; i<password.length(); i++){
            char character = password.charAt(i);

            if(Character.isUpperCase(character)){
                hasAnUpperCase = true;
            }
            if(Character.isLowerCase(character)){
                hasALowerCase = true;
            }
            if(Character.isDigit(character)){
                hasAtLeastOneNumber = true;
            }
            if(specialCharacters.indexOf(character) != -1){
                hasASpecialCharacter = true;
            }
        }

        if(!hasAnUpperCase){
            feedback += "Add at least one uppercase letter.\n";
        }
        if(!hasALowerCase){
            feedback += "Add at least one lowercase letter.\n";
        }
        if(!hasAtLeastOneNumber){
            feedback += "Add at least one number.\n";
        }
        if(!hasASpecialCharacter){
            feedback += "Include at least one special character.\n";
        }
        return feedback;

    }


}