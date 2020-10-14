package com.mycompany.app;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Hello world!
 *
 */
public class App
{
    public static String[] outArray;
    public static Hashtable<String, Integer> counterHash = new Hashtable<String, Integer>();

    public static void main(String[] args) {
        print("Input: " + Arrays.toString(args));
        try{
            program(args);
        } catch (Exception e) {
            print("Exception: " + e.toString());
            e.printStackTrace();
        }
        print("Output: " + Arrays.toString(outArray) + outArray.length);
    }

    public static String[] program(String[] str) {
        outArray = new String[str.length];
        String x; // hoisted for space complexity
        int y;
        for (int i = 0; i < str.length; i++) {
            x = str[i]; // destructuring
            y = Integer.parseInt(x);
            if (y % 15 == 0) {
                publish("fizzbuzz", i);
            } else if (y % 5 == 0) {
                publish("buzz", i);
            } else if (isLucky(x)) {
                publish("lucky", i);
            } else if (y % 3 == 0) {
                publish("fizz", i);
            } else {
                publish(x, i);
            }
        }
        report(outArray);
        print("report: " + counterHash.toString()); //reports
        return outArray;
    }

    public static String report(String[] array) {
        String arrayElement;
        Integer oldInt;
        counterHash.put("integer" , 0); // initialized prior
        for (int i = 0; i < array.length; i++) {
            arrayElement = array[i].toString();
            oldInt = counterHash.get(arrayElement);
            if (arrayElement == "fizz" || arrayElement == "buzz" || arrayElement == "fizzbuzz" || arrayElement == "lucky") {
                // strings
                if (counterHash.get(arrayElement) == null) {
                    counterHash.put(arrayElement , 1); // initialized during
                } else {
                    counterHash.put(arrayElement, oldInt + 1);
                }
            } else {
                // integers
                oldInt = counterHash.get("integer");
                counterHash.put("integer", oldInt + 1);
            }
        }
        print("here: " + counterHash.toString()); // here: {fizz=4, integer=10, lucky=2, buzz=3, fizzbuzz=1}
        return counterHash.toString(); // just for testing
    }

    public static boolean isLucky(String x) {
        if(x.contains("3")){
            return true;
        } else {
            return false;
        }
    }

    public static void publish(String str, int idx) {
        outArray[idx] = str;
        //print(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
