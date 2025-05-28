// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

// Example 3:
// Input: nums = [0,1,1,1,1,1,0,0,0]
// Output: 6
// Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.
import java.util.*;

class Main{
    public static void main(String[] args){
        int[] inp = {0,1,1,1,1,1,0,0,0};
        System.out.println(maxContigousLen(inp));
    }

    public static int maxContigousLen(int[] arr){
        // First we are converting the zeros into -1 
        for(int i=0 ; i< arr.length; i++){
            if(arr[i]==0) 
                arr[i]=-1; 
        }

        // Then we are introducing a HashMap that stores the sum as key and the position as its value 
        // Then we are cross checking it , if the sum is available in the map then we are determining its length 
        // Ifn't then we are adding the new sum to the hashMap

        Map<Integer,Integer> dpMap = new HashMap<>();
        dpMap.put(0,-1);
        int maxLen= 0, sum= 0;

        for(int i=0 ; i< arr.length; i++){
            sum+= arr[i];
            if(dpMap.containsKey(sum)){
                maxLen= Math.max(maxLen, (i -dpMap.get(sum)));
            }else{
                dpMap.put(sum, i);
            }
        }

        return maxLen;
        
    }
}