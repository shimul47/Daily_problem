class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        int i =1;
        while (i<n){
            StringBuilder prev = s;
            StringBuilder temp = new StringBuilder();
            for(int j = prev.length()-1;j>=0;j--){
                if(prev.charAt(j) == '1'){
                    temp.append('0');
                }else{
                    temp.append('1');
                }
            }
            s = prev.append("1").append(temp);
            i++;
        }
        return s.charAt(k-1);
    }
}