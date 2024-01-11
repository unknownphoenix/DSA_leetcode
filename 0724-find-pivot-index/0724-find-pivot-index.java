class Solution {
    public int pivotIndex(int[] nums) {
        int[] p = new int[nums.length];
        int sum = nums[0];
        p[0]=0;
        for (int i =1;i<nums.length;i++){
            sum+=nums[i];
            p[i] = p[i-1]+nums[i-1];
        }
        for(int i =0;i<nums.length;i++){
            if(p[i]==(sum-nums[i]-p[i])){
                return i;
            }
        }
        return -1;
    }
}