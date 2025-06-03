// You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

// Return true if you can reach the last index, or false otherwise.

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

// Here we are gonna use the Greedy approach method to obtain the optimal Solution
class Main{
    public static void main(String[] args){
        int[] inp = {2,3,1,1,4};
        System.out.println(isPossibleJump(inp));
    }

    public static boolean isPossibleJump(int[] arr){
        // Here we are taking the last index as destination to reach and we are gonna find whether there are ways to reach from before index of the destination 
        int dest= arr.length-1;
        for(int i= arr.length-2; i>=0; i--){
            // If we can reach the destination then we are changing the destination to the current index and then repeat             
            if(arr[i]+i >= dest){
                dest = i;
            }
        }
        return dest == 0;
    }
}