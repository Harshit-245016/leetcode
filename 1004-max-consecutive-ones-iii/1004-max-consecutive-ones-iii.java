class Solution {
    public int longestOnes(int[] nums, int k) {
        // int count =0;
        int ans=0;
        // int m=0;
        for(int i=0;i<nums.length;i++){
            int count =0;
            int temp=k;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    count++;
                }
                else if(nums[j] !=1 && temp!=0){
                    count++;
                    temp--;
                }
                else{
                    break;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}