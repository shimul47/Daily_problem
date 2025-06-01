class Solution:
    def distributeCandies(self, n: int, limit: int) -> int:
        lim = min(n,limit)+1
        count = 0
        for i in range(lim):
            last = max(0,n-i-limit)
            fst = min(limit,n-i)
            if last <= fst:
                count += (fst-last+1)
        return count

        