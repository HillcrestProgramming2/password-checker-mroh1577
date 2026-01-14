package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests an example weak passcode
 */

public class FeedbackGeneratorTest {
    @Test
    public void testingForWeakPasscode(){
        String expected = "Increase the length to at least 8 characters.\n" +
                "Add at least one uppercase letter.\n" +
                "Add at least one lowercase letter.\n" +
                "Include at least one special character.\n";
        Assertions.assertEquals(expected, FeedbackGenerator.generateFeedback("12345"));
    }

    /**
     * tests the sample moderate passcode
     */
    @Test
    public void testingForAMediumLevelPasscode(){
        String expected = "Add at least one uppercase letter.\n" +
                "Include at least one special character.\n";
        Assertions.assertEquals(expected, FeedbackGenerator.generateFeedback("greeting234"));
    }

    /**
     * tests a sample of the Strongest passocde
     */
    @Test
    public void testingForTheBestPasscode(){

        Assertions.assertEquals("", FeedbackGenerator.generateFeedback("HelloKids@123"));
    }
}
