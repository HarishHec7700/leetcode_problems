class Main{
    public static void main(String[] arg){

        int[] range = {1, 2, 4, 6, 7, 9};
        System.out.println(missingEle(range));
    }
    public static ArrayList<Integer> missingEle(int[] arr){
        // First we need to find the max and min value of the given array 
        // So we are iterating first 
        int min = arr[0];
        int max= arr[0];
        for(int i : arr){   
            if(i < min) 
                min= i;
            if(i > max)
                max = i;  
        }
        // Then we are generating a range from min value to max 
        ArrayList<Integer> range= new ArrayList<>();
        for(int i= min; i<= max; i++){
            range.add(i);
        }
        // Converting the primitive int array to Integer Array 
        ArrayList<Integer> presentList= new ArrayList<>();
        for(int i : arr){
            presentList.add(i);
        }
        // Finding out the element that is missing from the present List array and storing it in a Array List 
        ArrayList<Integer> missNo= new ArrayList<>();
        for(Integer i : range){
            if(!presentList.contains(i))
                missNo.add(i);
        }
        return missNo;
    }
}