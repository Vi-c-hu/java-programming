import java.util.*; 
class factor
 {
    public static void main(String[] args) {
        int number = 100; 
        int count = 0;

        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                count++;
            }
        }

        System.out.println("Number of factors for " + number + " are: " + count);
    }
}