class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            if (target - nums[i] in nums and nums.index(target - nums[i]) != i):
                return i,nums.index(target - nums[i])