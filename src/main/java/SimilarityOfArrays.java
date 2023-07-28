import java.util.Arrays;

public class SimilarityOfArrays {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int length = 0;

        if (s1.length > s2.length) {
            length = s2.length;    
        }else if(s1.length < s2.length){
            length = s1.length;
        }else{
            length = s1.length;
        }

        for (int i = 0; i < length; i++) {
            if (s1[i] == s2[i]) {
                answer ++;
            }
        }
        return answer;
    }
}
