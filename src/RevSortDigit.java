import java.util.*;

public class RevSortDigit {
    public static void main(String args[]) {
        int input;
        while (true) {
            int output = 0;
            System.out.print("Enter a number: ");
            Scanner in = new Scanner(System.in);
            try {
                input = Integer.parseInt( in.next() );
            }
            catch (NumberFormatException ex ){
                System.out.println(ex);
                continue;
            }
            int temp = input;
            int count = 0;
            do{
                count++;
                temp /= 10;
            }
            while(temp != 0);
            //System.out.println(count);
            temp = input;
            int arr[] = new int[count];
            int i = 0;
            while(temp != 0){
                arr[i++] = temp % 10;
                temp /= 10;
            }
            Arrays.sort(arr);
            output = arr[count - 1];
            for(int j=1; j<count; j++){
                output = output*10 + arr[count - j - 1];
            }
            System.out.println("Sorted number in non-decreasing order: "+output);
            int sum = 0;
            while(output != 0){
                int digit = output % 10;
                if(digit % 2 == 0){
                    sum += digit;
                }
                output /= 10;
            }
            System.out.println("Sum of even nummbers: "+sum);
            if(sum > 15)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
