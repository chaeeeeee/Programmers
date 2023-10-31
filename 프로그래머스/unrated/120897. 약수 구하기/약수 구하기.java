class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int index = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer[index] = i;
                index++;
            }
        }
        
        int[] result = new int[index];
        
        for(int i = 0; i < index; i++) {
            if(answer[i] != 0) {
                result[i] = answer[i];
            }
        }
        
        return result;
    }
}