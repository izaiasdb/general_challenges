package org.example.leetcode.longestCommonPrefix14;

import java.util.Arrays;

public class LeetCode14P01 {

    public static void main(String[] args) {
        //System.out.println(longestCommonPrefix( new String[]{"flower", "flow", "flight"})); // fl
        System.out.println(longestCommonPrefix( new String[]{"flower", "flow", "flight", "flame"})); // fl
        //System.out.println(longestCommonPrefix( new String[]{"dog", "racecar", "car"})); // "" There is no common prefix among the input strings.
        //System.out.println(longestCommonPrefix( new String[]{"a"})); // "" There is no common prefix among the input strings.
        //System.out.println(longestCommonPrefix( new String[]{"cir","car"})); // c
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
    
}
