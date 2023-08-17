public class 문자열뒤집기 {
    public String solution(String my_string) {
        my_string = "jaron";
        String answer = "";
        for (int i = my_string.length()-1; i > 0; i--) {
            answer += Character.toString(my_string.charAt(i));
        }
        System.out.println(Character.toString(my_string.charAt(0)));
        System.out.println("정답"+answer);
        return answer;
    }

    public static void main(String[] args) {
        문자열뒤집기 reverse = new 문자열뒤집기();
        reverse.solution("jaron");
    }
}
