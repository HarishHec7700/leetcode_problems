//  Bubble sort
//  Here we need to compare the consecutive numbers and then we need to swap it according to the condition 
//  Here we need 2 loops to iterate the second loop to check after the consecutive numbers and once the 1st iteration of the first loop completes we get the one sorted element to the front or the back acc to the condtion 


class Main{
    public static void main(String[] args) {

    int[] arr = {7,5,8,2,6,12};
    int[] res = bubbleSort(arr);
    printArr(res);
    }

    public static void printArr(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i< n-1 ; i++ ){
            for(int j = 0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}