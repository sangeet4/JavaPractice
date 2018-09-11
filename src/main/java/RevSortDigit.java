import java.util.*;

public class RevSortDigit {
//    public static void main(String args[]) {
//        int input;
//        while (true) {
//            int output = 0;
//            System.out.print("Enter a number: ");
//            Scanner in = new Scanner(System.in);
//            try {
//                input = Integer.parseInt( in.next() );
//            }
//            catch (NumberFormatException ex ){
//                System.out.println(ex);
//                continue;
//            }
//            int temp = input;
//            int count = 0;
//            do{
//                count++;
//                temp /= 10;
//            }
//            while(temp != 0);
//            //System.out.println(count);
//            temp = input;
//            int arr[] = new int[count];
//            int i = 0;
//            int sum = 0;
//            while(temp != 0){
//                arr[i] = temp % 10;
//                if(arr[i] % 2 == 0)
//                    sum += arr[i];
//                temp /= 10;
//                i++;
//            }
////            for(int j=0; j<count; j++)
////                System.out.println(arr[j]);
//            Arrays.sort(arr);
//            output = arr[count - 1];
//            for(int j=1; j<count; j++){
//                output = output*10 + arr[count - j - 1];
//            }
//            String sumStatus;
//            if(sum > 15)
//                sumStatus = new String("True");
//            else
//                sumStatus = new String("False");
//            System.out.println("Sorted number in non-decreasing order: "+output+"\nSum of even nummbers: "+sum+"\n"+sumStatus);
//        }
//    }

    public String reverseAndSum(String num){
        int input;
        int output = 0;
        try {
            input = Integer.parseInt(num);
        }
        catch (NumberFormatException ex ){
            return "Error! Input Entered is not a number";
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
        int sum = 0;
        while(temp != 0){
            arr[i] = temp % 10;
            if(arr[i] % 2 == 0)
                sum += arr[i];
            temp /= 10;
            i++;
        }
        Arrays.sort(arr);
        output = arr[count - 1];
        for(int j=1; j<count; j++){
            output = output*10 + arr[count - j - 1];
        }
        String sumStatus;
        if(sum > 15)
            sumStatus = new String("True");
        else
            sumStatus = new String("False");
        return ("Sorted number in non-increasing order: "+output+"\nSum of even nummbers: "+sum+"\n"+sumStatus);
    }
}
