class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int curr = 0;
        int far = 0;
        for (int i = 0 ; i <nums.length-1; i++){
            far = Math.max(far, i + nums[i]);

            if (i == curr){
                jump ++;
                curr = far;
            }
        }
        return jump;
    }
}