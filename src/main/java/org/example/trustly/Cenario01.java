package org.example.trustly;

import java.sql.Array;

public class Cenario01 {


    // Correção
    static int solution(int[] A) {
        int ans = A[0]; // Definir o valor inicial como o primeiro elemento do array
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }

    // Bug
//    static int solution(int[] A) {
//        int ans = 0;
//        for (int i = 1; i < A.length; i++) {
//            if (ans > A[i]) {
//                ans = A[i];
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        int[] array = {-1, 1, -2, 2};

        System.out.println(solution(array));
    }
}
