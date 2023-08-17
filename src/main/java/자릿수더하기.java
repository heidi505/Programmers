public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String sn = String.valueOf(n);
        int[] arr = new int[sn.length()];

        for (int i = 0; i < arr.length; i++) {
            
            answer += Character.getNumericValue(sn.charAt(i));
            
        }
        
      
        return answer;
    }

    public static void main(String[] args) {
        자릿수더하기 add = new 자릿수더하기();
        add.solution(930211);
        
    }
}
