class Solution {
    public String solution(String my_string, String letter) {
        String result = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (!String.valueOf(ch).equals(letter)) {
                result += ch;
            }
        }
        
        return result;
    }
}