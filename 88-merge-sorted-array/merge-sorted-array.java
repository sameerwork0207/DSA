class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;

        while (p2 >= 0) {
            //if p2 ends then program stops running, remaining elements in nums1 are already sorted and at correct place

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                //if p1 ends then we stop checking for elements in nums1, keep executing the else condition below until the p2 also ends
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }

            i--;
            
        }
    }
}