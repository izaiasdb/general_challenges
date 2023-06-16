package org.example.trustly;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Cenario03 {
    /*
    public int solution(int[] A, int X, int Y, int Z) {
        int maxWaitingTime = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(A));

        int[] fuelLevels = { X, Y, Z };

        while (!queue.isEmpty()) {
            int fuelDemand = queue.poll();
            int minFuelLevel = Integer.MAX_VALUE;
            int chosenDispenser = -1;

            // Find the dispenser with the smallest label that has enough fuel
            for (int i = 0; i < fuelLevels.length; i++) {
                if (fuelLevels[i] >= fuelDemand && fuelLevels[i] < minFuelLevel) {
                    minFuelLevel = fuelLevels[i];
                    chosenDispenser = i;
                }
            }

            // If no dispenser has enough fuel, return -1
            if (chosenDispenser == -1)
                return -1;

            // Update the fuel level of the chosen dispenser and calculate the waiting time
            fuelLevels[chosenDispenser] -= fuelDemand;
            maxWaitingTime = Math.max(maxWaitingTime, minFuelLevel - fuelDemand);
        }

        return maxWaitingTime;
    }*/

    public int solution(int[] A, int X, int Y, int Z) {
        int maxWaitingTime = 0;
        Queue<Integer> queue = new LinkedList<>();
        Arrays.stream(A).forEach(queue::add);

        int[] fuelLevels = { X, Y, Z };

        while (!queue.isEmpty()) {
            int fuelDemand = queue.poll();
            int chosenDispenser = -1;

            // Find the dispenser with the smallest label that has enough fuel
            for (int i = 0; i < fuelLevels.length; i++) {
                final int idx = i;
                if (fuelLevels[i] >= fuelDemand && (chosenDispenser == -1 || fuelLevels[idx] < fuelLevels[chosenDispenser])) {
                    chosenDispenser = idx;
                }
            }

            // If no dispenser has enough fuel, return -1
            if (chosenDispenser == -1)
                return -1;

            // Update the fuel level of the chosen dispenser and calculate the waiting time
            fuelLevels[chosenDispenser] -= fuelDemand;
            int minFuelLevel = fuelLevels[chosenDispenser] + fuelDemand;
            maxWaitingTime = Math.max(maxWaitingTime, minFuelLevel - fuelDemand);
        }

        return maxWaitingTime;
    }

    public static void main(String[] args) {
        //Example test:   ([2, 8, 4, 3, 2], 7, 11, 3)
        //WRONG ANSWER (got 3 expected 8)
        //Example test:   ([5], 4, 0, 3)
    }
}
