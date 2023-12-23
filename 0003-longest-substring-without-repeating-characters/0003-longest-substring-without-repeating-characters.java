class Solution {
    public int lengthOfLongestSubstring(String s) {
        int currlen = 0;
        int maxlen = 0;
        int j =-1;
        int i = 0;
        boolean var[] = new boolean[256];
        while(i < s.length()){
            char ch = s.charAt(i);
            //duplicate is present
            while(var[ch] == true){
                j++;
                char ch_to_release = s.charAt(j);
                var[ch_to_release] = false;
            }
            // no duplicat is present
            var[ch]= true;
            currlen = i-j;
            
            maxlen = Math.max(maxlen,currlen);
            
            i++;
        }
        return maxlen;
    }
}