import java.util.Arrays;

public class MaxIndex {
    public int solution(int[] numbers) {
        int answer = 0;
        int n = numbers.length;
        Arrays.sort(numbers);
        answer = numbers[n-1]*numbers[n];
        return answer;
    }
}
