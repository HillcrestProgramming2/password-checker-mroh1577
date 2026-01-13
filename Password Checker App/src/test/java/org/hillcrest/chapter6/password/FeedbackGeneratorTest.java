package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FeedbackGeneratorTest {

    @Test
    public void testingForBadPasscode(){
        String expected = "Increase the length to at least 8 characters.\n"
                + "Add at least one uppercase letter.\n" +
                "Add at least one lowercase letter.\n" +
                "Include at least one special character.\n";

        Assertions.assertEquals(expected, FeedbackGenerator.generateFeedback("98765"));
    }

    @Test
    public void testingForAModeratePasscode(){
        String expected = "Add at least one uppercase letter.\n" +
                "Include at least one special character.\n";
        Assertions.assertEquals(expected, FeedbackGenerator.generateFeedback("happiness123"));

    }

    @Test
    public void testingForAStrongPasscode(){
        Assertions.assertEquals("", FeedbackGenerator.generateFeedback("helloWorld@123"));
    }


}




