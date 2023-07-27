
public class Lamb {
    public int solution(int n, int k) {
        int answer = 0;
        int s = n/10;
        answer = 2000*(k-s) + 12000*n;
        return answer;
    }
}
