public class FromNthElement {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        for (int i = n; i < num_list.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                answer[j] = num_list[n];
            }
        }
        return answer;
    }
}
