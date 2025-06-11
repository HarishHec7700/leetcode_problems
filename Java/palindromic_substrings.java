// Given a string s, return the number of palindromic substrings in it.

// A string is a palindrome when it reads the same backward as forward.

// A substring is a contiguous sequence of characters within the string.

// Example 1:

// Input: s = "abc"
// Output: 3
// Explanation: Three palindromic strings: "a", "b", "c".
// Example 2:

// Input: s = "aaa"
// Output: 6
// Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

// So if the string is odd then we need to can ommit the middle letter and check for others 
// Like so if the string is even then we need to check the every chars from the middle 

 

class Main{
    public static void main(String[] arg){
        String str ="aaa";
        System.out.println(countSubstrings(str));
    }

    public static int countSubstrings(String s){
        int count =0;
        for(int i= 0; i< s.length(); i++){
            // Creating the functions so that we need to check that concequtive elements are palindrome or not
            // So for the calculating odd numbers of characters we pass the left and right arguments same .
            count += subStrings(s, i,i);
            // So for the calculating even numbers of characters.
            count += subStrings(s, i,i+1);
        }
        return count;
    }

    public static int subStrings(String s , int left , int right){
        int count=0 ;

        // So here we are consider the each iteration as the middle element and checking to some boundary checks as well. 
        // If both are same then we incre the count and we need to look for the prev and next char so we incre the right and decre the left. 
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}