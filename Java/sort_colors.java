// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Here we are using a three pointer stratergy 

class Main{
    public static void main(String[] arg){
        int[] inp = {2,0,2,1,1,0};
        printArray(sortColors(inp));
    }
    
    public static int[] sortColors(int[] arr){
        int start = 0, mid = 0, end = arr.length-1;
        // here we are running the while loop with mid because we are not sure of its position.
        while(mid <= end){
            // We know that only 3 possibility 
            // if the ele is 0 then we will swap it with the start and then we will increment the start and mid ;
            // if the ele is 1 then we will just increment mid ;
            // if the ele is 2 then we will swap it with the end and then we will increment the end ;
            
            switch(arr[mid]){
                case 0:
                    swap(arr,mid,start);
                    mid++;
                    start++;
                    break;
                case 1: 
                    mid++;
                    break;
                case 2: 
                    swap(arr,mid, end);
                    end--;
                    break;
            }
        }
        return arr;
    }

    public static void printArray (int[] arr){
        for(int i : arr)
            System.out.println(i);
    }

    public static void swap(int[] arr,int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1]= arr[pos2];
        arr[pos2]= temp;
    }
}