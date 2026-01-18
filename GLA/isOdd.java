import java.util.Scanner;
public class isOdd {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = obj.nextInt();
        }
        boolean result = isOdd(arr,size);
        System.out.println(result);

    }
    public static boolean isOdd(int[] arr, int size){
        for(int i=0; i<size; i++){
            if(arr[i] % 2 != 0){
                return true;
            }
        }
        return false;
    }
    
}
