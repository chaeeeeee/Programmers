class Solution {
    public String solution(String my_string, int n) {
        
        String answer = "";
        for (int i = my_string.length() - n; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            answer += ch;
        }
        
        return answer;
    }
}