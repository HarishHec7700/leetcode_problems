class Main{
    public static void main(String[] args) {
        
        int steps = 6
        System.out.println(climbStairs(steps));
    }

    public int climbStairs(int n){
        if(n==1) return 1;

        int[] possWayArr = new int[n+1];
        possWayArr[1] = 1;
        possWayArr[2] = 2;

        for(int i = 3 ; i<= n ; i++){
            possWayArr[i] = possWayArr[i-1] + possWayArr[i-2];

        }
        return possWayArr[n];
    }
}