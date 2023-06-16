package org.example.trustly;

import java.util.ArrayList;
import java.util.List;

public class Cenario02 {

    /*
    static boolean isBlocked(String[] R,
                             int posArray,
                             int posSquare) {
        return R[posArray].charAt(posSquare) == 'X';
    }

    static void replaceArray(String[] R,
                             int posArray,
                             int posSquare) {
        R[posArray] = R[posArray].substring(0, posSquare) + "0" + R[posArray].substring(posSquare + 1);
    }

    static int solution(String[] R) {
        int posArray = 0;
        int posSquare = 0;
        Boolean notStop = true;
        char blocked = 'X';
        // 0 right, 1 down, 2 left, 3 up
        int direction = 0;
        int cleaned = 0;
        String text = "";

        while (notStop) {
            String value = "";

            if (posArray < R.length && posSquare < R[posArray].length()) {
                value = String.valueOf(R[posArray].charAt(posSquare));
                text += value;

                if (R[posArray].charAt(posSquare) ==  '0') {
                    cleaned++;
                    notStop = false;
                }
            }

            if (direction == 0) {
                if (posSquare > R[posArray].length() || R[posArray].charAt(posSquare) == blocked) {
                    direction++;
                    posSquare--;
                    text = "";
                    if (posArray < R.length) { // Se tem para baixo
                        posArray++;
                    }
                } else {
                    replaceArray(R, posArray, posSquare);
                    posSquare++;
                    cleaned++;
                }
            } else if (direction == 1) {
                if (posArray >= R.length || R[posArray].charAt(posSquare) == blocked) {
                    direction++;
                    posArray--; //Permanecer na linha
                    text = "";
                    if (posSquare > 0) {
                        posSquare--;
                    }
                } else {
                    replaceArray(R, posArray, posSquare);
                    posArray++;
                    cleaned++;
                }
            } else if (direction == 2) {
                if (posSquare == 0 || isBlocked(R, posArray, posSquare)) {
                    if (posSquare == 0)
                        replaceArray(R, posArray, posSquare);
                    direction++;
                    text = "";
                    if (posArray > 0) {
                        posArray--;
                    }
                } else {
                    replaceArray(R, posArray, posSquare);
                    posSquare--;
                    cleaned++;
                }
            } else if (direction == 3) {
                if (posArray == 0 || isBlocked(R, posArray, posSquare)) {
                    direction = 0;
                    posArray--; //Permanecer na linha
                    text = "";
                    if (isBlocked(R, posArray, posSquare)) {
                        posArray++;
                    }
                } else {
                    replaceArray(R, posArray, posSquare);
                    posArray--;
                    cleaned++;
                }
            }
        }

        return cleaned;
    }*/

    /*
    static int solution(String[] R) {
        int n = R.length; // Number of rows
        int m = R[0].length(); // Number of columns
        int[][] grid = new int[n][m]; // Initialize a grid to keep track of cleaned squares
        int count = 0; // Counter for the number of cleaned squares
        int row = 0; // Current row position of the robot
        int col = 0; // Current column position of the robot
        int direction = 0; // 0: right, 1: down, 2: left, 3: up

        while (true) {
            // Check if the current square is clean
            if (grid[row][col] == 0) {
                grid[row][col] = 1; // Mark the square as clean
                count++; // Increment the counter
            }

            // Try moving in the current direction
            if (direction == 0 && col + 1 < m && R[row].charAt(col + 1) == '.') {
                col++; // Move right
            } else if (direction == 1 && row + 1 < n && R[row + 1].charAt(col) == '.') {
                row++; // Move down
            } else if (direction == 2 && col - 1 >= 0 && R[row].charAt(col - 1) == '.') {
                col--; // Move left
            } else if (direction == 3 && row - 1 >= 0 && R[row - 1].charAt(col) == '.') {
                row--; // Move up
            } else {
                direction = (direction + 1) % 4; // Rotate clockwise
            }
        }

        return count;
    }*/

    public int solution(String[] R) {
        int n = R.length; // Number of rows
        int m = R[0].length(); // Number of columns
        int[][] grid = new int[n][m]; // Initialize a grid to keep track of cleaned squares
        int count = 0; // Counter for the number of cleaned squares
        int row = 0; // Current row position of the robot
        int col = 0; // Current column position of the robot
        int direction = 0; // 0: right, 1: down, 2: left, 3: up
        int startRow = 0; // Initial row position of the robot
        int startCol = 0; // Initial column position of the robot
        int startDir = 0; // Initial direction of the robot

        while (true) {
            // Check if the current square is clean
            if (grid[row][col] == 0) {
                grid[row][col] = 1; // Mark the square as clean
                count++; // Increment the counter
            }

            // Try moving in the current direction
            if (direction == 0 && col + 1 < m && R[row].charAt(col + 1) == '.') {
                col++; // Move right
            } else if (direction == 1 && row + 1 < n && R[row + 1].charAt(col) == '.') {
                row++; // Move down
            } else if (direction == 2 && col - 1 >= 0 && R[row].charAt(col - 1) == '.') {
                col--; // Move left
            } else if (direction == 3 && row - 1 >= 0 && R[row - 1].charAt(col) == '.') {
                row--; // Move up
            } else {
                direction = (direction + 1) % 4; // Rotate clockwise
            }

            // Check if the robot has returned to the initial position and direction
            if (row == startRow && col == startCol && direction == startDir) {
                break; // Exit the loop
            }
        }

        return count;
    }

    public static void main(String[] args) {
        //String[] array = {"...X..", "....XX", "..X..."}; //A - 6
        String[] array = {"....X..", "X......", ".....X.", "......."}; //B - 15
        //String[] array = {"...X.", ".X..X", "X...X", "..X.."}; //C - 9

        //System.out.println(solution(array));
    }
}
