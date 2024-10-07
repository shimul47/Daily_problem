class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0; i<details.length;i++ ){
            char one = details[i].charAt(11);
            char two = details[i].charAt(12);
            if (one>'6' || (one == '6' && two> '0')){
                count++;
            }
        }
        return count;
    }
}