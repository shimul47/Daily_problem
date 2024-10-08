class Solution {
    public int minSwaps(String s) {
        int count = 0;
        for (int i = 0; i< s.length(); i++){
            if (s.charAt(i) == '['){
                count++;
            }else if (count>0){
                count-=1;
            }
        }
        return (count+1)/2;
    }
}