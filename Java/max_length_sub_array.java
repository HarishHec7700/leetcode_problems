// Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.

// Example 1:

// Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
// Output: 3
// Explanation: The repeated subarray with maximum length is [3,2,1].

// So for this problem we are gonna use the dynamic programming concept using memorization table .
// So the answer is simple we are gonna over impose the secound array over the first one. And we use the dparray for remembering the result of the previous occurrences.
// And there by we are maintaining the length as well. 

class Main{
    public static void main(String[] args){
        int[] inp1={1,2,3,2,1};
        int[] inp2={3,2,1,4,7};
        System.out.println(maxLengthSubArray(inp1,inp2));
    }
    public static int maxLengthSubArray(int[] arr1, int[] arr2){
        int[][] dpArr = new int[arr1.length+1][arr2.length+1];
        int len = 0;
        // Since we are gonna need to fetch the left diagonal value if any match found hence we are initializing the first row and the columns as zero  
        for(int i=0;i< arr1.length;i++){
            dpArr[i][0] = 0;
        }
        for(int j=0;i< arr2.length;j++){
            dpArr[0][j] = 0;
        }

        for(int i =1;i< arr1.length; i++){
            for(int j=1; j<arr2.length; j++){
                // If both of them matches then we are gonna update the dpArray by incrementing the left diagonal value with one. 
                if(arr1[i-1] == arr2[j-1]){
                    dpArr[i][j] = dpArr[i-1][j-1]+ 1;
                    len = Math.max(len , dpArr[i][j]);
                }
            }
        }

        return len;
    }
}