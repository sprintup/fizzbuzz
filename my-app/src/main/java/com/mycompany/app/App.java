package com.mycompany.app;

import java.util.Arrays;
/**
 * Hello world!
 *
 */
public class App
{
    public static String[] outArray;

    public static void main(String[] args) {
        print("Input: " + Arrays.toString(args));
        try{
            program(args);
        } catch (Exception e) {
            print("Exception: " + e.toString());
        }
        print("Output: " + Arrays.toString(outArray));
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
            } else if (y % 3 == 0) {
                publish("fizz", i);
            } else {
                publish(x, i);
            }
        }
        return outArray;
    }
    public static void publish(String str, int idx) {
        outArray[idx] = str;
        //print(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
