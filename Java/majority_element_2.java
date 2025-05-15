//  Find the majority element that repeats more than n\3 times where n is the length of the given array 

// Solution is simple here there can be only 2 elements that can repeat more than n\3 times. 
// Hence we are repeating the same voting system bt with 2 majority and 2 counters to count upon. 

class Main{
    public static void main(String[] args){
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        if(len == 0) return null;

        int maj1= Integer.MIN_VALUE;
        int maj2= Integer.MIN_VALUE;
        int vote1= 0;
        int vote2= 0;
        // [1,1,1,5,4,9,9,4]
        // First we are identifing the two elements that are majority in the first for loop 
        for(int i =0; i<len ; i++){
            // We need to ensure that the majority ele should be different hence maj2 != nums[i] condition  
            if(vote1 == 0 && maj2 != nums[i]){
                maj1 = nums[i];
                vote1++;
            }else if(vote2== 0 && maj1 != nums[i]){
                maj2= nums[i];
                vote2++;
            }else if(nums[i] == maj1)   vote1++;
            else if(nums[i] == maj2)    vote2++;
            else{
                vote1--;
                vote2--;
            } 
        }
        int count1 = 0;
        int count2 = 0;
        List<Integer> ans = new ArrayList<>();
        
        // This for loop is excecuted to identifing the count of the majority elements
        for(int i : nums){
            if(i == maj1)   count1++;
            if(i == maj2)   count2++;
        }
        if(count1 > (len/3))
            ans.add(maj1);
        if(count2 > (len/3))
            ans.add(maj2);
        return ans;
    }

}
