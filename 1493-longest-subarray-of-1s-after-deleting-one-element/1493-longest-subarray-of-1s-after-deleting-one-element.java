class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int i =0;
        int j =-1;
        int coz =0;
        while(i<nums.length){
            if(nums[i]==0){
                i++;
                coz++;
            }
            else{
                i++;
            }
            while(coz>1){
                j++;
                if(nums[j]==0)
                    coz--;
            }
            int s = i-1-j;
            ans = Math.max(ans,s);
        }
        return ans-1;
    }
}