public class Prefix {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        boolean prefix = false;
        char[] myArr = new char[is_prefix.length()];
        char[] prefixArr = new char[is_prefix.length()];
        for (int i = 0; i < is_prefix.length(); i++) {
            myArr[i] = my_string.charAt(i);
        }
        if (prefixArr == myArr) {
            prefix = true;
        }
        answer = prefix? 1 : 0;
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";

        Prefix sl = new Prefix();
    }
}
