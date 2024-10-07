class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        sum1=nums[0]
        sum2=nums[1]
        for i in range(2,len(nums)):
            if(i%2==0):
                sum2=max(sum1,sum2)
                sum1+=nums[i]
            else:
                sum1=max(sum1,sum2)
                sum2+=nums[i]
        return max(sum1,sum2)
    #fjgit co