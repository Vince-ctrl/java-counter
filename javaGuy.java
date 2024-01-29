/**
 * javaGuy
 */
public class javaGuy {

    public static void main(String[] args) {
        int num,result;
        num = 0;
        while (num < 100) {
            num++;
            result = num % 2;
            System.out.println(num);
            if (result == 0) {
                System.out.println("even");
            }
            if (result == 1) {
                System.out.println("odd");
            }
        }
    }
}