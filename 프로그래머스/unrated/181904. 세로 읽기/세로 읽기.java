class Solution {
    public String solution(String my_string, int m, int c) {
        
        String answer = "";
        for (int i = c-1; i < my_string.length(); i+=m) {
            char ch = my_string.charAt(i);
            
            answer += ch;
        }
        
        return answer;
    }
}