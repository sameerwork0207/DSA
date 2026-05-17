class Solution {
    public void moveZeroes(int[] nums) {
        
        int intcounter=0;

        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[intcounter]=nums[i];
                intcounter++;
            }
        }
        for(;intcounter<nums.length;intcounter++){
            nums[intcounter]=0;
        }
    }
}