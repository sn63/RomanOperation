package com.roman;

import java.util.Scanner;

public class IntegerToRoman {
    private static String intToRoman(int number) {
        String[] romanNumerals = { "M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] romanNumeralNums = {  1000, 900, 500,  400 , 100,  90,  50,  40,   10,   9,   5,   4,   1 };
        String finalRomanNum = "";

        for (int i = 0; i < romanNumeralNums.length; i ++) {
            int currentNum = number /romanNumeralNums[i];
            if (currentNum==0) {
                continue;
            }

            for (int j = 0; j < currentNum; j++) {
                finalRomanNum +=romanNumerals[i];
            }

            number = number % romanNumeralNums[i];
        }
        return finalRomanNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer value :");
        int number = sc.nextInt();
        System.out.println("The converted roman name : "+intToRoman(number));
    }
}
