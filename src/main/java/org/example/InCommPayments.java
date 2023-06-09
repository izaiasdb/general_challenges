package org.example;

// You need to return the index of the first unique char
public class InCommPayments {

    public static int getUniqueCharacter(String s) {
        int index = 0;

        while(index < s.length()) {
            String remove = s.replace(String.valueOf(s.charAt(index)), "");
            if (remove.length() == s.length() -1){
                return index+1;
            };
            index++;
        }

        return -1;

        /*
        int index = 0;

        while(index <= s.length()) {
            String rest = s.substring(index +1, s.length());
            String repeated = String.valueOf(s.charAt(index));
            if (!rest.contains(repeated)){
                return index;
            };
            index++;
        }*/

        /*
        int index = 0;
        String repeated;

        for (index = 0; index <= s.length(); index++) {
            repeated = String.valueOf(s.charAt(index));
            boolean isRepeated = false;

            for(int j = index+1; j <= s.length() -1; j++){
                String letter = String.valueOf(s.charAt(j));
                if (repeated.equals(letter)){
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                break;
            }
        }

        return index+1;*/
    }

    public static void main(String[] args) {
        int index = getUniqueCharacter("hackthegame");
        //int index = getUniqueCharacter("falafal");
        System.out.println(index);

    }
}
