class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[] = new int[n];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                // int j=0;
                ans[j*2]=nums[i];
                j++;
            }
            else{
                // int k=0;
                ans[(k*2)+1]=nums[i];
                k++;
            }
        }
        return ans;
    }
}