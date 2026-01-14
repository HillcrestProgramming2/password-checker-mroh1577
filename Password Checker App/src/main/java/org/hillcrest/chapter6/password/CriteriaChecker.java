package org.hillcrest.chapter6.password;

public class CriteriaChecker {


    /**
     * checks to see what aspects the password meets
     * @param password- the password that the user gives
     * @return- the score of how good the password is
     */
    //utility class
    public static int evaluateCriteria(String password){
        if (password == null ) {
            return 0;
        }
        int count = 0;
        boolean hasAnUpperCase = false;
        boolean hasALowerCase = false;
        boolean hasAtLeastOneNumber = false;
        boolean hasASpecialCharacter = false;
        final String specialCharacters = "!@#$%^&*()-+=";

        if(password.length() >= 8){
            count ++;
        }
        for(int i = 0; i < password.length(); i ++){
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
        if(hasAnUpperCase) count ++;
        if(hasALowerCase) count ++;
        if(hasAtLeastOneNumber) count ++;
        if(hasASpecialCharacter) count ++;

        return count;

    }

    /**
     * returns the written statement of what to say
     * @param count-how good the password is
     * @return-the word of how good a password is
     */

    public static String determineStrength(int count) {

        if(count <= 2) {
            return "Weak";
        } else if (count == 3){
            return "Moderate";
        } else{
            return "Strong";
        }
    }

}
