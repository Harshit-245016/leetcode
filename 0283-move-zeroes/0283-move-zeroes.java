class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                result.add(nums[i]);
            }
        }
        int m=result.size();
        for(int i=0;i<m;i++){
            nums[i]=result.get(i);
        }
        for(int i=m;i<n;i++){
            nums[i]=0;
        }
    }
}