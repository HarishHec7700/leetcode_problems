// Find the  


// Input: grid = [
//   ['1','1','1','1','0'],
//   ['1','1','0','1','0'],
//   ['1','1','0','0','0'],
//   ['0','0','0','0','0']
// ]

// Ans 1

// Input: grid = [
//   ['1','1','0','0','0'],
//   ['1','1','0','0','0'],
//   ['0','0','1','0','0'],
//   ['0','0','0','1','1']
// ]

// Ans 3

class Main {
    public static void main(String[] args) {
        char[][] input= {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        
        int ans = noOfIslands(input);
        System.out.println(ans);
 
    }

    public static int noOfIslands(char[][] grid){
        // Condition to check whether the grid is empty or not 
        if(grid == null || grid.length == 0 || grid[0].length == 0)    
        int island= 0;

        for(int i=0;i< grid.length;i++){
            for(int j=0;j< grid[i].length; j++){
                if(grid[i][j] =='1'){
                    dfs(grid, i,j);
                    island++;
                }
            }
        }
        return island;
    }

    public static void dfs(char[][] grid , int i, int j){
        // Condition to check the boundaries or current element is water element  
        
        if(i < 0 || j < 0 
        || i >= grid.length || j >= grid[0].length ||
        grid[i][j] == '0'
        ){
            return ;
        }
        grid[i][j] = '0';
        
        // Search for land elements on all sides 
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        
    }
}
