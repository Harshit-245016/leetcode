class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        int sum=0,maxsum;
        for(int i=0;i<k;i++){
            sum +=nums[i];
        }
        maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum += nums[i]-nums[i-k];
            maxsum = Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}