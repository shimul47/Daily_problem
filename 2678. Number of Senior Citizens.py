class Solution:
    def countSeniors(self, details: List[str]) -> int:
        count = 0
        
        for i in details:
            z=""
            z+=i[11]+i[12]
            if int(z)>60:
                count+=1
        return count