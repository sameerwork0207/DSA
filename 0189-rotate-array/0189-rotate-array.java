class Solution {
    public void rotate(int[] nums, int k) {
        int[]nums2=new int [nums.length];
        k=k%nums.length;

        for(int i=0;i<nums.length;i++){
            if (i+k<nums.length){
                nums2[i+k]=nums[i];
            }
            else{
                nums2[i+k-nums.length]=nums[i];
            }
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=nums2[i];
        }
        
    }
}