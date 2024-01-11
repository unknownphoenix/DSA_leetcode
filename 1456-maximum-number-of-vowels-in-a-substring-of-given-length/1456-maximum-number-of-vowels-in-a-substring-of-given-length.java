class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int ans = 0;
        for(int i =0;i<k;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        ans = count;
        //   for remaining characters
        for(int i =k;i<s.length();i++){
            char chi = s.charAt(i);
            char chiz = s.charAt(i-k);
            if(isVowel(chi)){
                count++;
            }
            if(isVowel(chiz)){
                count--;
            }
           ans = Math.max(ans,count);     
        }
        return ans;
    }
    public boolean isVowel(char ch){
        if(ch == 'a')
            return true;
        else if(ch == 'e')
            return true;
        else if(ch=='i')
            return true;
        else if (ch=='o')
            return true;
        else if(ch =='u')
            return true;
        else
            return false;
    }
}