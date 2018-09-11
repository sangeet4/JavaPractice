import java.util.*;

public class Addition {
    public static void main(String args[]){
        int input;
        int sum = 0;
        Scanner in  = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number to add(Enter 0 to stop adding): ");
            try
            {
                input = Integer.parseInt( in.next() );
            }
            catch (NumberFormatException ex )
            {
                System.out.println(ex);
                continue;
            }
            sum += input;
            if(input == 0)
                break;
        }
        System.out.println("Sum is: "+sum);
    }
}
