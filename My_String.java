import java.util.Arrays;

public class My_String {
     public String solution(String rny_string) {
        String answer = "";
        char[] arr = new char[rny_string.length()];
        String[] strArr = new String[rny_string.length()];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
           arr[i] = rny_string.charAt(i);
           strArr[i] = String.valueOf(arr[i]);
        }

        for (int i=0; i < strArr.length; i++) {
            if (strArr[i] == "m") {
                 strArr[i] = "rn";
            }
            stringBuilder.append(strArr[i]);
        }
        answer = stringBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        String rny_string = "programmers";
        My_String ms = new My_String();
        ms.solution(rny_string);
    }
}


//1. String -> char 배열
//2. char 배열 -> String 배열
//3. String 배열 -> String 문자열 (String builder) toString으로 하면 배열 모양 그대로 문자열이 됨