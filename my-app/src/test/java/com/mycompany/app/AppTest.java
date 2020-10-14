package com.mycompany.app;

import com.mycompany.app.App;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldPrintInteger() {
        // Arrange
        String[] testInput = {"1"};
        String[] expected = {"1"};
        com.mycompany.app.App mainClass = new com.mycompany.app.App();
        // Act
        String[] actual = com.mycompany.app.App.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPrintFizz() {
        // Arrange
        String[] testInput = {"6"};
        String[] expected = {"fizz"};
        App mainClass = new App();
        // Act
        String[] actual = App.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldPrintBuzz() {
        // Arrange
        String[] testInput = {"5"};
        String[] expected = {"buzz"};
        App mainClass = new App();
        // Act
        String[] actual = App.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldPrintFizzBuzz() {
        // Arrange
        String[] testInput = {"15"};
        String[] expected = {"fizzbuzz"};
        App mainClass = new App();
        // Act
        String[] actual = App.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }

//    @Test
//    public void shouldPassStep1() {
//        // Arrange
//        String[] testInput = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
//        String[] expected = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"};
//        App mainClass = new App();
//        // Act
//        String[] actual = App.program(testInput);
//        // Assert
//        assertArrayEquals(expected, actual);
//    }
    @Test
    public void shouldFailWithString() {
        // Arrange
        String[] testInput = {"abc"};
        App mainClass = new App();
        // Act
        // Assert
        assertThrows(NumberFormatException.class, () -> {
            App.program(testInput);
        });
    }
    @Test
    public void shouldFailWithOutOfBounds() {
        // Arrange
        fail(); // with the first pass I had to learn Java and set up the environment and didn't do TDD in the sense of red/green/refactor, since I need to understand Java before I can test it. At this point it seems like there should be a way to pass an array of integers to the main method, however, it's not clear why I'm getting an error when trying to pass anything but a string array. Ideally, these tests would be structured so they test integers.
        // Act
        // Assert
    }
    @Test
    public void shouldPrintLucky() {
        // Arrange
        String[] testInput = {"3"};
        String[] expected = {"lucky"};
        App mainClass = new App();
        // Act
        String[] actual = App.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldPassStep2() {
        // Arrange
        String[] testInput = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        String[] expected = {"1", "2", "lucky", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "lucky", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"};
        App mainClass = new App();
        // Act
        String[] actual = App.program(testInput);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldPassStep3() {
        // Arrange
        String[] testInput = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        String expected = "{fizz=4, integer=10, lucky=2, buzz=3, fizzbuzz=1}";
        App mainClass = new App();
        // Act
        String actual = mainClass.report(testInput);
        mainClass.print("actual: "+actual);
        // Assert
        assertEquals(expected, actual);
    }
}
