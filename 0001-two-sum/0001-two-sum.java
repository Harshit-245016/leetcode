class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int l=0,m=0;
       for(int i=0;i<nums.length-1;i++){
        // int sum=0;
        for(int j=i+1;j<nums.length;j++){
            int sum=0;
            sum=nums[i]+nums[j];
            if(sum==target){
                return new int[] {i,j};
            }
        }
       }
       return new int[] {};
    }
}