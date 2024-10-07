class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solveSudoku(board,0,0);
           
    }
    public boolean solveSudoku(char [][]board,int row,int col){
       for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j]!='.'){
                    char num = board[i][j];
                    if(!isSafe(board,i,j,num)){
                        return false;
                    }
                }
            }
       }
       return true;
       
    }
    public boolean isSafe(char [][]board,int row, int col,char num){
        for (int i = 0; i<9;i++){
            if (board[i][col]==num && i!= row ) {
                return false;
            }
            if (board[row][i]==num && i != col) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j]==num && i!= row && j!=col) {
                    return false;
                }
            }
        }
        return true;        
    }
}