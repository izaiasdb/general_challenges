package org.example.leetcode.romanToInteger13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode13My {

    public static void main(String[] args) {
        System.out.println("I" + " " + romanToInt("I")); // 1
        System.out.println("IV" + " " + romanToInt("IV")); // 4
        System.out.println("LVIII" + " " + romanToInt("LVIII")); //58
        System.out.println("MCMXCIV" + " " + romanToInt("MCMXCIV")); //1994
    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        Map<String, Integer> mapCombined = new HashMap<>();
        mapCombined.put("IV", 4);
        mapCombined.put("IX", 9);
        mapCombined.put("XL", 40);
        mapCombined.put("XC", 90);
        mapCombined.put("CD", 400);
        mapCombined.put("CM", 900);

        String[] values = s.split("");

        List<Integer> romanValues = new ArrayList<>();
        boolean jump = false;

        for (int i = 0; i < values.length; i++) {
            if (!jump &&  hasNextValue(values, i + 1) && mapCombined.get(values[i] + values[i+1]) != null) {
                romanValues.add(mapCombined.get(values[i] + values[i+1]));
                jump = true;
            } else if (!jump){
                romanValues.add(map.get(values[i]));
                jump = false;
            } else if (jump){
                jump = false;
            }
        }

        return romanValues.stream().mapToInt(Integer::intValue).sum();
    }

    private static boolean hasNextValue(String[] values, int index){
        return values.length > index;
    }
    
}
