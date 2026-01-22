import java.util.Scanner;
import java.util.*;


public class Merge_Sort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void mergesortArray(int[] arr, int[] brr){
            int i = 0; int j = 0, k = 0;
            int[] merged = new int[arr.length + brr.length];
            while(i < arr.length && j < brr.length){
                if(arr[i] < brr[j]){
                    merged[k++] = arr[i++];
                }
                else{
                    merged[k++] = brr[j++];
                }
            }
            if(j == brr.length)
            while(i < arr.length){
                merged[k++] = arr[i++];
            }
            if(i == arr.length)
            while(j < brr.length){
                merged[k++] = brr[j++];
            }
           printArray(merged);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size1 of the array: ");

        int size1 = obj.nextInt();
        if(!obj.hasNextLine()){
           System.out.println("invalid input please enter valid input");
           obj.close();
           return;
    }
        int[] arr = new int[size1];
        System.out.println("Enter " + size1 + " elements: ");
        for(int i=0;i<size1;i++){
              arr[i] = obj.nextInt();
           
        }
        System.out.println("Enter the size2 of the array: ");

        int size2 = obj.nextInt();
        if(!obj.hasNextLine()){
           System.out.println("invalid input please enter valid input");
           obj.close();
           return;
    }
        int[] brr = new int[size2];
        System.out.println("Enter " + size2 + " elements: ");
        for(int i=0;i<size2;i++){
             arr[i] = obj.nextInt();
           
        }
        mergesortArray(arr,brr);
        printArray(arr);
        printArray(brr);
    }

}