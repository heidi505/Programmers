import java.util.Arrays;

class Logic {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int n = 0;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        if(arr[0] == arr[3]){
            answer = 1111 * arr[0];
        }
        //case 1
        else if (arr[0] != arr[3]) {
            if (arr[0] == arr[1] && arr[2] == arr[3]) {
                answer = (arr[0]+arr[2])*(arr[2]-arr[0]);
            } //case 3
            else if (arr[0] != arr[1] && arr[1]==arr[3]) {
                answer = (arr[1]*10+arr[0])*(arr[1]*10+arr[0]);
            } //case 2-1
            else if (arr[2] != arr[3] &&arr[0]==arr[2]) {
                answer = (arr[0]*10+arr[3])*(arr[0]*10+arr[3]);
            } //case 2-2
            else if(arr[0] == arr[1]){
                answer = arr[2]*arr[3];
            } else if (arr[1] == arr[2]) {
                answer = arr[0]*arr[1];
            } else if (arr[2] == arr[3]) {
                answer = arr[0]*arr[3];
            }  //case 4
        }

        if(a != b && b != c && c != d && a != d && a !=c && b != d) {
            answer = arr[0];
        }//case 5

        return answer;
    }




    public static void main(String[] args) {
            int a = 2;
            int b = 5;
            int c = 2;
            int d = 6;

            Logic logic = new Logic();
            int result = logic.solution(a, b, c, d);

            System.out.println("Result: " + result);
        }
}

// *****************4,5번 조건문이 문제인듯*********************