package org.example.leetcode.longestCommonPrefix14;

public class LeetCode14My {

    public static void main(String[] args) {
        //System.out.println(longestCommonPrefix( new String[]{"flower", "flow", "flight"})); // fl
        //System.out.println(longestCommonPrefix( new String[]{"dog", "racecar", "car"})); // "" There is no common prefix among the input strings.
        //System.out.println(longestCommonPrefix( new String[]{"a"})); // "" There is no common prefix among the input strings.
        System.out.println(longestCommonPrefix( new String[]{"cir","car"})); // c
    }

    public static String longestCommonPrefix(String[] strs) {
        String commonLetters = ""; String tempLetters = "";

        if (strs.length == 1) return strs[0];

        for(int word = 1; word < strs.length; word++) {
            commonLetters = tempLetters;
            tempLetters = "";

            for(int i = 0; i < strs[word].length(); i++) {
                if (word == 1 &&
                    i < strs[word - 1].length() &&
                    strs[word].charAt(i) == strs[word - 1].charAt(i)) {

                    tempLetters += String.valueOf(strs[word].charAt(i));
                } else if (word == 1 &&
                        i < strs[word - 1].length() &&
                        strs[word].charAt(i) != strs[word - 1].charAt(i)) {
                    break;
                } else if (word > 1 &&
                        i < strs[word - 1].length() &&
                        i < commonLetters.length() &&
                        strs[word].charAt(i) == strs[word - 1].charAt(i) &&
                        strs[word].charAt(i) == commonLetters.charAt(i)) {

                    tempLetters += String.valueOf(strs[word].charAt(i));
                }
            }
        }

        return tempLetters;
    }
    
}
