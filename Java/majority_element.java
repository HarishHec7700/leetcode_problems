// Given a array with n no of elements need to find the majority element in the array .The majority element can be determined by their occurence of n/2 times . 
// So here we are using the Boyer-Moore Voting Algorithm 
// Here We are initializing 2 variables one for the counter and another one 


class Main {
    public static void main(String[] args){
        int[] arr = {2,5,2,4,2,5,2};
        System.out.println(majorityElement(arr));
    } 

    public static int majorityElement(int[] arr){
        int maj_ele = arr[0];
        int votes = 1;

        // So here starts the voting systems 
        // Here we by default take the first ele of the arr as majority and default value of vote is 1  
        for(int i = 1; i< arr.length; i++){
            // First we check whether the current ele is same as majority ele if yes incre the vote if not decre vote 
            // and other conditon if vote == 0 we need to change the majority to the current ele 
            
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
        // Here now we now that the majority ele but we don't know whether it satisfy the condition n/2 where n= length of the input array 
        // Hence we are manually iterating it and then we are counting its occurences 
        
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