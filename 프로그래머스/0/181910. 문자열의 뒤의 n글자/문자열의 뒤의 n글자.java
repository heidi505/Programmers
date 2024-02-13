class Solution {
    public String solution(String my_string, int n) {
         String answer = "";
            int startingIndex = my_string.length() - n;
            answer = my_string.substring(startingIndex);
            return answer;
    }
}