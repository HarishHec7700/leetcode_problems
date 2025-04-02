// Rotting Orange 
// You are given an m x n grid where each cell can have one of three values:

// 0 representing an empty cell,
// 1 representing a fresh orange, or
// 2 representing a rotten orange.
// Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

// Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

// Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
// Output: 4


class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    
        int[][] grid = {{2,0}};
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] timeGrid = new int[m][n];
        
        // Creating a new grid with is used to store the time taken to rot each orange 
        for(int i=0;i<grid.length;i++){
            for(int j =0 ; j< grid[i].length; j++){
                timeGrid[i][j] = Integer.MAX_VALUE;
            }
        }
        // Locating the rotten one first and doing the depth first search 
        for(int i=0;i<grid.length;i++){
            for(int j =0 ; j< grid[i].length; j++){
                if(grid[i][j] == 2) 
                    dfs(grid,timeGrid, i ,j,0);
            }
        }

        int reqTime = 0;
        // Traveresing through both grids to find out the maximum time taken 
        for(int i=0;i<grid.length;i++){
            for(int j =0 ; j< grid[i].length; j++){
                if(grid[i][j] == 1 ) {
                   // If any fresh orange found after dfs we need to return -1 
                    if(timeGrid[i][j] == Integer.MAX_VALUE) 
                        reqTime=  -1;
                    reqTime = Math.max(timeGrid[i][j],reqTime);
                    }
                }
            }
        System.out.println(reqTime);
        }
    
    
    public static void dfs(int[][] grid,int[][] timeGrid, int i , int j , int currentTime){
        // Conditions to be checked 
        // 1. To check valid boundaries  2. Nearby elements value 0  3. Check whether the oranges are previously rotten
 
        if(i<0 || j<0 || i>= grid.length || j>= grid[0].length || currentTime >= timeGrid[i][j] || grid[i][j] ==0)
            return;
            
        timeGrid[i][j]= currentTime;    
        
        dfs(grid,timeGrid,i+1,j,currentTime+1);
        dfs(grid,timeGrid,i-1,j,currentTime+1);
        dfs(grid,timeGrid,i,j+1,currentTime+1);
        dfs(grid,timeGrid,i,j-1,currentTime+1);    
    }
    
}