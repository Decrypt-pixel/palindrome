package edu.mills.cs180;

import static edu.mills.cs180.PalindromeChecker.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome_True_EmptyString() {
        assertTrue(isPalindrome(""));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AMA", "racecar", "x"})
    void isPalindrome_True_AcceptsStrings(String s) {
        assertTrue(isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "abc", "spatula"})
    void isPalindrome_False_RejectsStrings(String s) {
        assertFalse(isPalindrome(s));
    }

}
