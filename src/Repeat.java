import java.util.*;

public class Repeat {
    public static void main(String args[]) {
        String str;
        int n;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a string: ");
            str = in.nextLine();
            System.out.print("Enter a number: ");
            n = in.nextInt();
            int length = str.length();
            int diff = length - n;
            if (diff < 0) {
                System.out.println("Error");
            } else {
                int index = diff;
                char[] arr = new char[n];
                for (int j = 0; index < length; index++, j++) {
                    arr[j] = str.charAt(index);
                }
                System.out.print(str);
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[j]);
                    }
                }
                System.out.println();
            }
        }
    }
}
