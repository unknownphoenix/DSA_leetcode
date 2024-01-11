class Solution {
    public int largestAltitude(int[] gain) {
        int height = 0;
        int maxHt =0;
        for(int i =0;i<gain.length;i++){
            height +=gain[i];
            maxHt = Math.max(maxHt,height);
        }
        return maxHt;
    }
}