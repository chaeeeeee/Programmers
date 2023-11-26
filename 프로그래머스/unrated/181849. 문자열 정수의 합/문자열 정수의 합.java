class Solution {
    public int solution(String num_str) {
        int sum = 0;
        
        for (int i = 0; i < num_str.length(); i++) {
            char ch = num_str.charAt(i);
            
            sum += Character.getNumericValue(ch);
        }
        
        return sum;
    }
}