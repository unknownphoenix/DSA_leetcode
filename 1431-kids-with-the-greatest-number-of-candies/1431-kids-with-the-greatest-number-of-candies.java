class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maximum = candies[0];
        for(int i = 0; i<candies.length;i++){
            if (candies[i]>=maximum)
                maximum = candies[i];
        }
        for (int val:candies){
            ans.add(val+extraCandies >= maximum);
        }
        return ans;
    }
}