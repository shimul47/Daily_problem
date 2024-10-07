class Solution {
    public boolean checkValid(int[][] matrix) {
        int sz = matrix.length;
        for (int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                int num =matrix[i][j];
                if (!isSafe(matrix,i,j,num)){
                    return false;
                }
            }
        }
        return true;     
    }
    public boolean isSafe(int[][]matrix,int row,int col, int num){
        for (int i=0;i<matrix.length;i++){
            if(matrix[i][col] ==num && i!=row){
                return false;
            }
            if(matrix[row][i]==num && i!=col){
                return false;
            }
        }
        return true;
    }
}