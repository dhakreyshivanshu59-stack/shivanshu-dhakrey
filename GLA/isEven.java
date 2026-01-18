import java.util.Scanner;

public class isEven{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int size = obj.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = obj.nextInt();
        
       
    }
    boolean result = isEvenfint(arr,size);
    System.out.println(result);
}
    public static boolean isEvenfint(int [] arr, int size){
        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                return true;
            }
        }
        return false;
    }
}