// Will be given a m*n matix need to find how many unique ways are possible to reach from the start of the matrix to the end of the matrix
// Note that can move only in one direction in a time either down or right ,no diagonal are allowed and there are no go back also 
// So here we are using the Dynamic approach to solve by using the memorization matrix and a formula 
// ways for arr[m][n] = arr[m-1][n] + arr[m][n-1]; 
// This problem is just a 2D modification of the climbing stairs 


class Main{
    public static void main(String[] args){
        int ans = uniqueWays(3,7);
        System.out.println(ans);        
    } 
    public static int uniqueWays(int x , int y){
        // Initializing the memorization table 
        int[][] mArr= new int[x][y];

        for(int i = 0; i< mArr.length; i++){
            for(int j =0; j< mArr[0].length; j++){
                // There is only single way to get to the all elements of first row and first column either by going right or down respectively
                if(i == 0 || j == 0)
                    mArr[i][j] = 1;
                else
                    mArr[i][j] = mArr[i-1][j]+mArr[i][j-1];
            }
        }
        return mArr[x-1][y-1];
    }
}