


public class fibonacci {
    public static void main(String [] args){
        
        int n = 5;
       
        int result = fiboseries(n);
        System.out.println(result);
            
            
        }

       public static int fiboseries(int n){
          int a = 0;
        int b = 1;
        int sum = 0;
        
        int i = 2;
       while(i<n){
            sum = a + b;
            a = b;
            b = sum;

            i++;
        }

        return sum;
    }

}

    

