import java.util.*;

public class Palindrome {
    public static void main(String args[]){
        long input;
        Scanner in = new Scanner(System.in);
        while(true){
            boolean flag = true;
            System.out.print("Enter a Number:");
            input = in.nextInt();
            long temp = input;
            long n = 1;
            while(temp/n >= 10){
                n *= 10;
            }
            while(temp != 0){
                long l = temp/n;
                long r = temp%10;
                if(l != r){
                    System.out.println(input+" is not a Palindrome.");
                    flag = false;
                    break;
                }
                temp = (temp % n) / 10;
                n /= 100;
            }
            if(flag == false){
                continue;
            }
            int sum = 0;
            temp = input;
            while(temp != 0){
                long digit = temp % 10;
                if(digit % 2 == 0) {
                    sum += digit;
                }
                temp /= 10;
            }
            if(sum > 25){
                System.out.println(input+" is palindrome and the sum of even numbers is greater than 25");
            }
            else{
                System.out.println(input+" is palindrome and the sum of even numbers is less than 25");
            }
        }
    }
}
