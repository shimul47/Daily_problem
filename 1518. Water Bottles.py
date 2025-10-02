class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        sum = numBottles
        while numBottles >= numExchange:
            numBottles -= numExchange
            sum += 1
            numBottles += 1
        return sum