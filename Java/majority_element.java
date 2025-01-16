// Given a array with n no of elements need to find the majority element in the array .The majority element can be determined by their occurence of n/2 times . 



class Main {
    public static void main(String[] args){
        int[] arr = {2,5,2,4,2,5,2};
        System.out.println(majorityElement(arr));
    } 

    public static int majorityElement(int[] arr){
        int maj_ele = arr[0];
        int votes = 1;

        for(i = 1; i< arr.length; i++){
            if(votes == 0){
                maj_ele = arr[i];
                votes++;
            }else if(arr[i] == maj_ele){
                votes++;
            }else{
                vote--;
                maj_ele = arr[i];
            }
        }
        int count = 0;
        for(int i : arr){
            if(i == maj_ele)
            count++;
        }
        if(count > arr.length/2)
            return maj_ele;
        else
            return -1;
    }
}