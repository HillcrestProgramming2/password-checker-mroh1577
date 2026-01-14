package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CriteriaCheckerTest {

    @Test
    public void testingTheWeakestPasscode(){
        Assertions.assertEquals(1, CriteriaChecker.evaluateCriteria("98765"));
    }

    @Test
    public void testingAMediumLevelPasscode(){
        Assertions.assertEquals(3, CriteriaChecker.evaluateCriteria("passcode123"));
    }

    @Test
    public void testingAGoodPasscode(){
        Assertions.assertEquals(5, CriteriaChecker.evaluateCriteria("Strong@1234"));
    }

    @Test
    public void testingTheWeakness(){
        Assertions.assertEquals("Weak", CriteriaChecker.determineStrength(2));
    }

    @Test
    public void testTheModerateOne(){
        Assertions.assertEquals("Moderate", CriteriaChecker.determineStrength(3));
    }

    @Test
    public void testTheStrongOne(){
        Assertions.assertEquals("Strong", CriteriaChecker.determineStrength(5));
    }

}
