class Main{
    public static void main(String[] args){
        String st1 ="zaktwe";
        String st1 ="ktwer";
        System.out.println(longestCommonSubstring(st1,st2));
    }

    public static int longestCommonSubstring(String str1,String str2){
        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();

        int[][] dp = new int[arr.length+1][arr2.length+1];
        int max =0;

        for(int i =1; i< str1.length; i++){
            for(int j=1; j< str2.length; j++){
                if(str1[i-1]== str2[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                    max= Math.max(dp[i][j] ,1);
                }  
            }
        }
        return max;
    }
}