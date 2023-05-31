package org.example.leetcode.romanToInteger13;

public class LeetCode13P01 {

    public static void main(String[] args) {
        System.out.println("I" + " " + romanToInt("I")); // 1
        System.out.println("IV" + " " + romanToInt("IV")); // 4
        System.out.println("LVIII" + " " + romanToInt("LVIII")); //58
        System.out.println("MCMXCIV" + " " + romanToInt("MCMXCIV")); //1994
    }

    public static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    private static boolean hasNextValue(String[] values, int index){
        return values.length > index;
    }
    
}
