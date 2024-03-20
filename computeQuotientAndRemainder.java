import java.util.*; 
class ComputeQuotientAndRemainder
 {
    public static void main(String[] args) 
{
        int dividend = 25;
        int divisor = 4;
        
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        
        System.out.println("Quotient of " + dividend + " divided by " + divisor + " is: " + quotient);
        System.out.println("Remainder of " + dividend + " divided by " + divisor + " is: " + remainder);
    }
}