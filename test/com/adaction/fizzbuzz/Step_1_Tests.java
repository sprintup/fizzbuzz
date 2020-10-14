package com.adaction.fizzbuzz;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Step_1_Tests {
    @Test
    public void shouldPrintInteger() {
        // Arrange
        String[] testInput = {"1"};
        String[] expected = {"1"};
        Main mainClass = new Main();
        // Act
        String[] actual = Main.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPrintFizz() {
        // Arrange
        String[] testInput = {"3"};
        String[] expected = {"fizz"};
        Main mainClass = new Main();
        // Act
        String[] actual = Main.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldPrintBuzz() {
        // Arrange
        String[] testInput = {"5"};
        String[] expected = {"buzz"};
        Main mainClass = new Main();
        // Act
        String[] actual = Main.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldPrintFizzBuzz() {
        // Arrange
        String[] testInput = {"15"};
        String[] expected = {"fizzbuzz"};
        Main mainClass = new Main();
        // Act
        String[] actual = Main.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPassStep1() {
        // Arrange
        String[] testInput = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        String[] expected = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"};
        Main mainClass = new Main();
        // Act
        String[] actual = Main.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFailWithString() {
        // Arrange
        String[] testInput = {"abc"};
        Main mainClass = new Main();
        // Act
        // Assert
        assertThrows(NumberFormatException.class, () -> {
            Main.program(testInput);
        });
    }
    @Test
    public void shouldFailWithOutOfBounds() {
        // Arrange
        fail(); // with the first pass I had to learn Java and set up the environment and didn't do TDD in the sense of red/green/refactor, since I need to understand Java before I can test it. At this point it seems like there should be a way to pass an array of integers to the main method, however, it's not clear why I'm getting an error when trying to pass anything but a string array. Ideally, these tests would be structured so they test integers.
        // Act
        // Assert
    }
}
