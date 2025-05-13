// Longest Non Repeating Substring 
// Given a string s, find the length of the longest substring without duplicate characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

class Main{
    public static void main (String[] args){
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
    }
    public static int longestSubstring(String str){
        int maxLen = 0;
        int left = 0;
        // we are using the set to store the non repeating characters 
        Set<Character> mem = new HashSet<>();

        // Here we are using the two pointers method where both start at the first and the right gradually incr until it found the repeating character
        for(int right=0 ; right < str.length(); right++){
            // Running while loop to find whether the char is present in the hash set or not
            while(mem.contains(s.charAt(right))){
                mem.remove(s.charAt(left));
                left++;
            }
            mem.add(str.charAt(right));
            maxLen= Math.max(right-left +1 , maxLen);
        }
        return maxLen;
    }
}