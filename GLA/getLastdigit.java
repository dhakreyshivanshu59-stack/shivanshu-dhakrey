import java.util.Scanner;

public class getLastdigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        callArray(arr);
         System.out.println();
        for(int ele: arr) {
        System.out.print(ele + " ");}
    }

    public static void callArray(int[] arr) {
        arr[0] = 1000;
        System.out.println();
       for(int ele: arr) {
        System.out.print(ele + " ");
       }


    }
}
