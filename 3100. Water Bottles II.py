class Solution:
    def maxBottlesDrunk(self, numBottles: int, numExchange: int) -> int:
        sum = numBottles
        while numBottles >= numExchange:
            numBottles -= numExchange
            sum += 1
            numExchange += 1
            numBottles += 1
        return sum