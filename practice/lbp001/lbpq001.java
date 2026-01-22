import java.util.Scanner;
import java.util.*;


public class lbpq001 {

    public static boolean isprimedigit(int number){
        if(number == 2|| number==3 || number==5|| number==7){
            return true;
        }
        else{
            return false;
        }

    }
    public static int primedigitsum(int number){
        int temp = number;
         int sum = 0;
        while(number != 0){
            
            int lastdigit = temp % 10;
            if(isprimedigit(lastdigit)){
             sum = sum + lastdigit;
            }
            temp /= 10;
        }
        return sum;
    }

    
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        if(!obj.hasNextInt()){
            System.out.print("Invalid Input : ");
            obj.close();
            return;
        }

        int number = obj.nextInt();

        int result = primedigitsum(number);
        System.out.println("Result is : "+ result);
        obj.close();
       



    }
}
