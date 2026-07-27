class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        // if(nums[0]>0){
            for(int i=0;i<n/2;i++){
                nums[i*2]=pos.get(i);
            }
            for(int i=0;i<n/2;i++){
                nums[i*2+1]=neg.get(i);
            }
        // }
        // else{
        //     for(int i=0;i<n/2;i++){
        //         nums[i*2]=neg.get(i);
        //     }
        //     for(int i=0;i<n/2;i++){
        //         nums[i*2+1]=pos.get(i);
        //     }
        // }
        return nums;
    }
}