class CountingDown {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        for (int i = start; i < answer.length; i--) {
            answer[i] = i;
        }
        return answer;
    }
}
