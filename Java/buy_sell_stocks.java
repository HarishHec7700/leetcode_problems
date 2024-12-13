// Buy Sell Stocks 
// Here the given array represents the prices of the stocks on day basics so here you can buy at low price and sell stocks at high price to make profits 
// So here we need to find the maximum profit we can make by buying and selling stocks on different days 

// We can solve this problem by using dynamic programming approach

class Main{
    public static void main(String[] args){
        int[] stkPrice={7, 8, 2, 4, 5, 9, 1};
        int maxProfit=findMaxProfit(stkPrice);
        System.out.println(maxProfit);
    }

    public static int findMaxProfit(int[] arr){
        int buyPrice = arr[0];
        int profit= 0;
        for(i =1; i< arr.length;i++){
            if(arr[i] < buyPrice){
                buyPrice=arr[i];
            }else{
                profit= Math.max(profit, arr[i] - buyPrice);
            }
        }
        return profit;
    }
}