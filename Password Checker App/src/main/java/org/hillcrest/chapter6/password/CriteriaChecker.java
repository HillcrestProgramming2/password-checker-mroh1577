package org.hillcrest.chapter6.password;

public class CriteriaChecker {

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

        return count;
    }

    public static String determineStrength(int score) {
        String strength;
        if(score <= 2) {
            strength = "weak";
        }
        if(score == 3){
            strength = "moderate";
        }
        if(score <= 5 || score >= 4){
            strength = "strong";
        }
        return strength;

    }


}
