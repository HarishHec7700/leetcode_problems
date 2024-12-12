// Given n number of elements in a array have to return the resultant array consisting of its product of all numbers except itself 
// Sample gn array = [3,8,1,2,9] Output = [144,54,432,216, 48] 
// leftArr = [1,3,24,24,48] rightAr= [144,18,18,9,1]

class Main{
    public static void main(String[] args) {
        int[] arr = {3,8,1,2,9};
        System.out.println(printArr(prodExpIt(arr)));
    }

    public static void printArr(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static int[] prodExpIt(int[] arr){
        int n= arr.length;
        int [] leftArr = new int [n];
        int [] rightArr = new int [n];
        int [] ansArr = new int [n];
        leftArr[0] = 1;
        rightArr[n-1] = 1;
        for(int i= 1; i< n; i++){
            leftArr[i] = arr[i-1] * leftArr[i-1];  
        }
        for(int i = n-2; i>= 0 ; i--){
            rightArr[i] = arr[i+1] * rightArr[i+1];
        }
        for(int i=0 l i<n ; i++){
            ansArr[i] = rightArr[i] * leftArr[i];
        }

        return ansArr;
    }
}