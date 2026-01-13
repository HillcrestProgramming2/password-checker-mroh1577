package org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password
    public static String generateFeedback(String password){
        String feedBack = "";
        boolean hasAnUpperCase = false;
        boolean hasALowerCase = false;
        boolean hasAtLeastOneNumber = false;
        boolean hasASpecialCharacter = false;

        String specialCharacters = "!@#$%^&*()-+=";

        if (password.length()< 8){
            feedBack += "Increase the length to at least 8 characters.\n";

        }

        for(int i = 0; i< password.length(); i++){
            char character = password.charAt(i);

            if(Character.isUpperCase(character)){
                hasAnUpperCase = true;
            } else if (Character.isLowerCase(character)){
                hasALowerCase = true;
            } else if (Character.isDigit(character)){
                hasAtLeastOneNumber = true;
            } else if (specialCharacters.indexOf(character) != -1){
                hasASpecialCharacter = true;
            }
        }

        if(!hasAnUpperCase){
            feedBack += "Add at least one uppercase letter.\n";
        }
        if(!hasASpecialCharacter){
            feedBack += "Include at least one special character.\n";
        }
        if(hasALowerCase){
            feedBack += "Add at least one lowercase letter.\n";
        }
        if(hasAtLeastOneNumber){
            feedBack += "Add at least one number\n";
        }
        return feedBack;

    }
}
