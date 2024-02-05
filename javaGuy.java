/**
 * javaGuy
 */
public class javaGuy {

    public static void main(String[] args) {
        int result,go,total;
        // go is a variable to read through the array num (i couldn't think of a better name)
        go = 0;
        // total is a variable to add up all the numbers in the array num
        total = 0;
        int[] num = new int[101];
        for (int i = 0; i < 101; num[i] = i++);
        while (go < 101) {
            System.out.println(num[go]);
            // finding if the number is even or odd by dividing it by 2 and seeing if it has a remainder or not
            result = num[go] % 2;
            // if it doesnt have a remainder the number is even
            if (result == 0) {
                System.out.println("even");
            }
            // if it does have a remainder the number is odd
            if (result == 1) {
                System.out.println("odd");
            }
            // total is added to the number currently being read in the array
            total = total + num[go];
            go++;
        }
        // total is printed, showing the total of all the numbers in the array
        System.out.println(total);
        }
    }