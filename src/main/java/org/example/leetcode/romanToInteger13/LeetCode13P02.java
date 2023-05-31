package org.example.leetcode.romanToInteger13;

public class LeetCode13P02 {

    public static void main(String[] args) {
        System.out.println("I" + " " + romanToInt("I")); // 1
        System.out.println("IV" + " " + romanToInt("IV")); // 4
        System.out.println("LVIII" + " " + romanToInt("LVIII")); //58
        System.out.println("MCMXCIV" + " " + romanToInt("MCMXCIV")); //1994
    }

    public static int romanToInt(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }

    private static boolean hasNextValue(String[] values, int index){
        return values.length > index;
    }
    
}
