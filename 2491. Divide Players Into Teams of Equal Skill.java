class Solution {
    public long dividePlayers(int[] skill) {
        long sum = 0;
        if (skill.length == 2){
            return skill[0]*skill[1];
        }
        Arrays.sort(skill);
        int i = 1;
        int j = skill.length-2;
        int check = skill[0] + skill[j+1];
        sum = skill[0]*skill[j+1];
        while (i<j){
            if (skill[i] + skill[j] != check){
                return -1;
            }else{
                sum += (skill[i] * skill[j]);
            }
            i++; j--;
        }
        return sum;
    }
}