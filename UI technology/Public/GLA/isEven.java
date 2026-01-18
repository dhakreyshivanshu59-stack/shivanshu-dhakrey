import java.util.Scanner;
public class isEven {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int size = obj.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
    }
}
        
