class Solution {
    public int maxScore(int[] nums, int k) {
        int n=nums.length;
        int lsum=0;
        int max=0;
        for(int i=0;i<k;i++){
            lsum+=nums[i];
            max=lsum;
        }
        int r=n-1;
        int rsum=0;
        for(int i=k-1;i>=0;i--){
            lsum-=nums[i];
            rsum+=nums[r];
            max=Math.max(max,lsum+rsum);
            r--;
        }
        return max;
    }
}