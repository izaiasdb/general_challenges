package org.example.leetcode.leetCode14;

import java.util.Arrays;

public class LeetCode14P02 {

    public static void main(String[] args) {
        //System.out.println(longestCommonPrefix( new String[]{"flower", "flow", "flight"})); // fl
        System.out.println(longestCommonPrefix( new String[]{"flower", "flow", "flight", "flame"})); // fl
        //System.out.println(longestCommonPrefix( new String[]{"dog", "racecar", "car"})); // "" There is no common prefix among the input strings.
        //System.out.println(longestCommonPrefix( new String[]{"a"})); // "" There is no common prefix among the input strings.
        //System.out.println(longestCommonPrefix( new String[]{"cir","car"})); // c
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    
}
