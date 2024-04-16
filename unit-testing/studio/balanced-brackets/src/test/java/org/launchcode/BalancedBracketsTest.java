package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    // #1  Refactor example test to use AAA pattern and message parameter
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

    //  #2  Test balanced brackets in front of other characters - []LaunchCode
    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "balanced brackets in front of other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    //  # 3  Test balanced brackets around other characters - []LaunchCode

    @Test
    public void singleBracketsAmongOtherCharacters() {
       String message = "balanced brackets among other characters returns true";
       String testData = "launch[Code]";
       boolean result = BalancedBrackets.hasBalancedBrackets(testData);
       assertTrue(result, message);

    }

    // # 4 test multiple consecutive pairs of balanced brackets   "[][][]"

    @Test
    public void tripledBalancedBrackets() {
        String message = "three consecutive pairs of balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);

    }
    /// # 5 Test multiple nested balanced brackets "[[[]]]"

    @Test
    public void tripleNestedBalancedBrackets() {
        String message = "three nested pairs of balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);

    }

    // # 6 Test single opening bracket - "["



    // # 7 Test single closing bracket - "]"


    // # 8 Test reversed bracket - "]["


    // # 9 Test single bracket with other characters - "[launchCode"
}