class Solution {
    public int smallestNumber(int n, int t) {
       while(true){
        int pro = 1;
        int temp=n;
        while(temp > 0){
            int d=temp%10;
            pro *=d;
            temp=temp/10;
        }
        if(pro % t==0){
            return n;
        }
        n++;
       } 
    }
}