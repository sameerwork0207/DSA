class Solution {
    public int majorityElement(int[] nums) {

        if (nums.length==0){
            return 0;
        }

           int maj=nums[0];
           int votes=0;
            

        
        for(int i =0;i<nums.length;i++){

            if (nums[i]==maj){
                votes++;
            }
            else{
                votes--;}
            
            if (votes<1){
                maj=nums[i];
                votes=1;
            }

        }




        return maj;
        
    }
}