class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int []arr = new int [n*(n+1)/2];
        int count = 0;
        
        for (int i=0;i<nums.length;i++){
            int temp =0;
            for(int j=i;j<nums.length;j++){
                if(i == j){
                    arr[count]=nums[i];
                    temp=nums[i];
                }
                else{
                    arr[count]=temp+nums[j];
                    temp=arr[count];
                }
                count++;
            }
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i =left-1;i<right;i++){
            sum = (sum+arr[i]) % 1000000007;
        }
        return sum;
    }
}