public class Discount {
    //0~10 & 10~30 & 30~50 & 50+
    public int solution(int price) {
        price= 580000;
        double answer = 0;
        if (price < 100000) {
            answer = price;
        } else if(100000 <= price && price < 300000) {
            answer = (int)price*0.95;
        } else if(300000 <= price && price <500000 ){
            answer = (int) price*0.9;
        } else if(price >= 500000){
            answer = (int) price*0.8;
        }
        return (int) answer;
    }

    public static void main(String[] args) {
        Discount discount = new Discount();
        discount.solution(580000);
        System.out.println(discount.solution(580000));
    }
}
