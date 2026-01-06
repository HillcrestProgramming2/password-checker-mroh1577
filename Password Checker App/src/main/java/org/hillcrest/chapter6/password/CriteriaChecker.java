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

    }

}
