
// Problem type 1 

// Consider the gn array value as the house having loot  here we need to find the maximum amount that are looted from the houses but the condition is that you can't loot the adjacent houses
// Here we are gonna break down the last sequence of house in which there are 2 possibilities one is robbing the last house or not robbing the last house.
// If we are robbing the last house then we can't rob the second last house 
// If we are not robbing the last house then we can rob the second last house 
// So we will take the maximum of both the possibilities and add it to the total loot amount.
// The formula is max(loot_of)

class Main{
    public static void main(String[] args) {
        int[] arr = {1,5,3,9,1,8}; 
        System.out.println(maxLoot1(arr));   // Ans : 22

        System.out.println(maxLoot2(arr));
    }

    public static int maxLoot1(int[] houseArr){
        if(houseArr.length == 0) return 0;
        if(houseArr.length == 1) return houseArr[0];
        // if(houseArr.length == 2) return Math.max(houseArr[0] , houseArr[1]);

        int[] dp = new int[houseArr.length];
        dp[0] = houseArr[0];
        dp[1] = Math.max(houseArr[0] , houseArr[1]);

        for(int i=2 ; i< houseArr.length; i++){
            dp[i] = Math.max(dp[i-2] +houseArr[i] , dp[i-1]);
        }
        return dp[houseArr.length -1];
    }

    // Problem type  

    // Consider the gn array value as the house having loot here we need to find the maximum amount that are looted from the houses 
    // But the condition is that you can't loot the adjacent houses and the houses are in circle shape 
    // Hence here if we rob the last house we can't rob the first house and vice versa 
    // If we are robbing the first house then we can't rob the last house  
    // If we are robbing the last house then we can rob the first house 
    // So we will break down into two scenerios looting houses leaving first house and vicevera.
    // The answer will be the max of both scenerios. 

    public static int maxLoot2(int[] houseArr){
        if(houseArr.length == 0) return 0;
        if(houseArr.length == 1) return houseArr[0];

        int[] skipLastHouse= new int[houseArr.length -1];
        int[] skipFirstHouse= new int[houseArr.length -1];

        // Initializing the value of the arrays 

        for(int i = 0 ; i< houseArr.length-1 ; i++){
            skipFirstHouse[i] = houseArr[i];
            skipLastHouse[i] = houseArr[i+1];
        }

        int skipFirstHouseLoot = maxLoot1(skipFirstHouse);
        int skipLastHouseLoot = maxLoot1(skipLastHouse);

        return Math.max(skipFirstHouseLoot,skipLastHouseLoot);
    }

}



