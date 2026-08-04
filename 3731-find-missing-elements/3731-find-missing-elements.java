class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int current=nums[i];
            int end=nums[i+1];
            for(int j=current+1;j<end;j++){
                list.add(j);
            }
        }
        return list;
    }
}