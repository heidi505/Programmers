class MakingArrays {
    public int[] solution(int n, int k) {
        int[] answer = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (i % k == 0) {
                     answer[j] = i; }
            }
            
        }
        return answer;
    }
}
// arraycopy() 써보기