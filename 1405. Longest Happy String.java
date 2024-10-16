class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int cA=0,cB=0,cC=0,i=0;
        int sum = a + b + c;
        StringBuilder str = new StringBuilder();
        while (i<sum){
            if(cA!=2 && a>=b && a>=c || a>0 &&(cB==2 || cC==2)){
                str.append('a');
                cA++;
                cB=0;
                cC=0;
                a--;
            }
            else if(cB!=2 && b>=c && b>=a || b>0 &&(cA==2 || cC==2)){
                str.append('b');
                cA=0;
                cB++;
                cC=0;
                b--;
            }
            else if(cC!=2 && c>=b && c>=a || c>0 &&(cB==2 || cA==2)){
                str.append('c');
                cA=0;
                cB=0;
                cC++;
                c--;
            }
            i++;
        }
        return str.toString();
    }
}