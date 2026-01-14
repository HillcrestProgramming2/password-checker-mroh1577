package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CriteriaCheckerTest {
    /**
     * tests the weak passcode
     */
    @Test
    public void testingTheWeakestPasscode(){
        Assertions.assertEquals(1, CriteriaChecker.evaluateCriteria("98765"));
    }

    /**
     * tests the medium level passcode
     */
    @Test
    public void testingAMediumLevelPasscode(){
        Assertions.assertEquals(3, CriteriaChecker.evaluateCriteria("passcode123"));
    }

    /**
     * Tests a passcode that fits all the criteria
     */
    @Test
    public void testingAGoodPasscode(){
        Assertions.assertEquals(5, CriteriaChecker.evaluateCriteria("Strong@1234"));
    }

    /**
     * testing how the weak output will be addressed
     */
    @Test
    public void testingTheWeakness(){
        Assertions.assertEquals("Weak", CriteriaChecker.determineStrength(2));
    }

    /**
     * testing how the moderate passcode will be addressed
     */
    @Test
    public void testTheModerateOne(){
        Assertions.assertEquals("Moderate", CriteriaChecker.determineStrength(3));
    }

    /**
     * Tests to see how the strong passcode will be addressed
     */
    @Test
    public void testTheStrongOne(){
        Assertions.assertEquals("Strong", CriteriaChecker.determineStrength(5));
    }

}
