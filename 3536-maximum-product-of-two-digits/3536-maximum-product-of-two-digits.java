class Solution {
    public int maxProduct(int n) {
        List<Integer> digit = new ArrayList<>();
        while(n>0){
            int d=n%10;
            digit.add(d);
            n=n/10;
        }
        int max=0;
        for(int i=0;i<digit.size();i++){
            for(int j=i+1;j<digit.size();j++){
                max=Math.max(max,digit.get(i)*digit.get(j));
            }
        }
        return max;
    }
}