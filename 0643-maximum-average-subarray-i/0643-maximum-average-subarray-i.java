class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg;
        double ans;
        int sum =0;
        // add the sum of k elements
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }
        avg = sum*1.0/k;
        ans = avg;
        // for the remaining elements
        for (int i = k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            avg = sum*1.0/k;
            ans = Math.max(ans,avg);
        }
        return ans;
    }
}