package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

1. Create a list of strings.
2. Add 5 lines from the keyboard to it.
3. Delete the last line and insert it at the beginning. Repeat 13 times.
4. Using a loop, display the contents of the screen, each value from a new line.

Requirements:
1. Declare a variable like list of strings and immediately initialize ee.
2. The program should read 5 lines from the keyboard.
3. Delete the last line and insert it at the beginning. Repeat 13 times.
4. The program should display a list on the screen, each value from a new line.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            strings.add(0, strings.remove(strings.size() - 1));
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}









