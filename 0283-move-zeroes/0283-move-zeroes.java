class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
            else{
                count ++;
            }
        }
        for(int i=0;i<count;i++){
            list.add(0);
        }
        for(int i=0;i<nums.length;i++){
           nums[i]= list.get(i);
        }
    }
}