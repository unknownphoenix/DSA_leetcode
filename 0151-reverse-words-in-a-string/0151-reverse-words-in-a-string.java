class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] words = s.trim().split(" ");
        for(int i = words.length-1 ; i>=0 ; i--){
            if(words[i].trim().isEmpty() == false){
                str.append(words[i]).append(" ");
            }
        }
        return str.toString().trim();
    }
}