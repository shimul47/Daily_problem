class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int c = 0;
        HashSet <Integer> ht = new HashSet<>();
        for (int i=0;i<banned.length;i++){
            ht.add(banned[i]);
        }
        for(int i = 1 ; i<=n; i++){
            if(!ht.contains(i)){
                if(i>maxSum){
                    return c;
                }else{
                    maxSum -= i;
                    c++;
                }
            }
        }
        return c;
    }
}