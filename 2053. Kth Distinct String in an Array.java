class Solution {
    public String kthDistinct(String[] arr, int k) {    
    int count=0,temp=0;    
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(i !=j && arr[i].equals(arr[j])){
                count=count+1;
            }
        }
        if(count==0){
            temp=temp+1;
        }
        if(temp==k){
            return arr[i];
        }
        count=0;   
    }
    return ""; 

    }
}