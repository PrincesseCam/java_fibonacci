//import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int N;
        for(N=1;N<=70;N++) {
            System.out.println(N); 
        }
        int[] F = new int [N];
        F[0] = 0;
        F[1] = 1;        
        for(int i=2;i<=N-1;i++){
            F[i] =F[i-1] + F[i-2];       
        }
        
    System.out.println(Arrays.toString(F)); 
        
    }
    
}
