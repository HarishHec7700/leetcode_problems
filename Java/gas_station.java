// There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

// You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. 
// You begin the journey with an empty tank at one of the gas stations.

// Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. 
// If there exists a solution, it is guaranteed to be unique.

// Example 1:

// Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
// Output: 3

class Main{
    public static void main(String[] args){
        int[] inpGas = {1,2,3,4,5};
        int[] inpDist = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(inpGas, inpDist));
    }

    public static int canCompleteCircuit(int[] gas , int[] dist){
        int totalGas = 0, totalDist= 0;
    //    So Here first we are calculating the sum of required dist and the total gas 
        for(int i =0 ; i< gas.length; i++){
            totalGas+= gas[i];
            totalDist+= dist[i];
        }
        // If the total required distance is greater than total gas no matter what we can never achieve the to complete the circuit.
        if(totalGas < totalDist)
            return -1;
        // Here we are iterating and calculating the current gas by adding the prev current gas along with the difference of the gas and the req distance 
        int currentGas = 0 , startIndex = 0;
        for(int i=0; i< gas.length; i++){
            currentGas += gas[i]- dist[i];
            // If the currentGas is less than 0 then it means we can go after that point hence change the start index to next 
            // And Reset the current gas 
            if(currentGas < 0){
                startIndex = i+1;
                currentGas =0;
            }
        }
        return startIndex; 
    }
}