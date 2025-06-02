// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. 
// If there is no such subarray, return 0 instead.

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 
// Here We are soliving it by using the combination of two pointer and the sliding window Mechanism 

class Main{
    public static void main(String[] args){
        int tar = 7;
        int[] ar = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(ar , tar));
    }

    public static int minSubArrayLen(int[] arr , int target){
        int left =0, right = 0 ,sum =0 , minLen = Integer.MAX_VALUE;
        while(right < arr.length){
            sum += arr[right];
            right++;
            // Inner While loop is for the window checking whether removing the left element that alters or not .
            while(sum >= target){
                int len = right- left;
                minLen = Math.min(minLen , len);
                sum -= arr[left];
                left++;
            }
        }
        // Here we are returning the minLen value if its changed or else we are returning the O;
        return minLen== Integer.MAX_VALUE ? 0 : minLen;
    }
}