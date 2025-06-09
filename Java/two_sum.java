// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Here there are two approaches to solve if the given input array is sorted then we cna directly go for the two pointer method 
// If the array isn't sorted then we can use the help of HashMap structure to store the rem(target - current ele) along with its index as value 

import java.util.*;

class Main{
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int tar = 9;
        System.out.println(twoSum(nums,tar));
    }

    public static int[] twoSum(int[] arr,int target){
        // Intializing the map to store the rem along with its indexes 
        Map<Integer ,Integer> dpMap = new HashMap<>();
        
        for(int i=0 ; i< arr.length; i++){
            int rem = target - arr[i];
            if(dpMap.containsKey(rem)){
                return new int[]{i,dpMap.get(rem)};
            }else{
                dpMap.put(arr[i],i);
            }
        }
        return new int[2];
    }
}