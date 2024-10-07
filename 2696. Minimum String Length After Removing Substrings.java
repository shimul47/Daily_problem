class Solution {
    public int minLength(String s) {
        Stack<Character> sc = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(sc.isEmpty() == false){
                char check = sc.peek();
                if((check == 'A' && s.charAt(i) == 'B') || check == 'C' && s.charAt(i) == 'D'){
                    sc.pop();
                    continue;
                }
            }
            sc.push(s.charAt(i));  
        }
        return sc.size();
    }   
}