class Solution:
    def canMakeSubsequence(self, str1: str, str2: str) -> bool:
        i = 0 
        j = 0
        while i<len(str1) and j<len(str2):
            if (str1[i] == str2[j]) or (ord(str2[j]) - ord(str1[i]) == 1) or (str2[j] == "a" and  str1[i] =="z"):
                j+=1
            i+=1
        return j == len(str2)
