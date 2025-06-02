class Solution:
    def candy(self, ratings: List[int]) -> int:
        candy = [1] * len(ratings)
        for i in range(1,len(ratings)):
            if ratings[i] > ratings[i-1]:
                candy[i] = candy[i-1]+1
        for j in range(len(ratings)-2,-1,-1):
            if ratings[j] > ratings[j+1]:
                candy[j] = max(candy[j],candy[j+1]+1)

        sum = 0
        for i in range(len(candy)):
            sum += candy[i]
        return sum    

        