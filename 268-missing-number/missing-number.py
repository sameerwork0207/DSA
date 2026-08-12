class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        TotalSum=0
        ActualSum=0
        for i,n in enumerate(nums):
            TotalSum=TotalSum+i
            ActualSum=ActualSum+n
        TotalSum=TotalSum+len(nums)
        diff=TotalSum-ActualSum
        return diff
        