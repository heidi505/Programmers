public class OddAndEven {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for (int j = 0; j < answer.length; j++) {
            if (num_list[j] % 2 == 0 ) {
                answer[0]++;
            }else{
                answer[1]++;
            }
        }
        return answer;
    }
}
