

public class Prefix { 
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        boolean prefix = my_string.startsWith(is_prefix);
        answer = prefix? 1 : 0;
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";

        Prefix sl = new Prefix();
    }
}
