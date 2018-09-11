import java.util.*;

public class ReverseString {
//    public static void main(String args[]) {
//        String str;
//        Scanner in = new Scanner(System.in);
//        while (true) {
//            System.out.print("Enter a string: ");
//            str = in.nextLine();
//            int length = str.length();
//            char[] arr = str.toCharArray();
//            for (int i = 0; i < length / 2; i++) {
//                char ch = arr[i];
//                arr[i] = arr[length - i - 1];
//                arr[length - i - 1] = ch;
//            }
//            for(int i=0; i<length; i++){
//                System.out.print(arr[i]);
//            }
//            System.out.println();
//        }
//    }

    public String stringReverse(String str){
        int length = str.length();
        char[] arr = str.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            char ch = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = ch;
        }
        String ret = new String(arr);
        return ret;
    }
}
