class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int nz=0,no=0,nt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nz++;
            }
            else if(nums[i]==1){
                no++;
            }
            else{
                nt++;
            }
        }
        for(int i=0;i<nz;i++){
            nums[i]=0;
        }
        for(int i=nz;i<nz+no;i++){
            nums[i]=1;
        }
        for(int i=no+nz;i<nz+no+nt;i++){
            nums[i]=2;
        }
    }
}