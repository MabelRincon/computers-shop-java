package dev.mabel.computer_shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

class AppTest {

    @Test
    @DisplayName("Test App runs without errors")
    void testAppRunsWithoutErrors() {
        try {
            App.main(new String[]{});
        } catch (Exception e) {
            fail("App should run without errors, but threw: " + e.getMessage());
        }
    }
}