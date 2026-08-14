class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        record=set()
        for num in nums:
            if num in record:
                return num
            else:
                record.add(num)
        