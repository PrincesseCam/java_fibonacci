import java.util.Scanner;
import java.util.Arrays;

public class insert{
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        int N=0;    
        do{        
        System.out.println("整数を入力してください。");
        N = scan.nextInt();
        

        int[] F = new int [N];
        F[0] = 0;
        F[1] = 1;

        int i = 0;
        for(i=2;i<=N-1;i++){
            F[i] =F[i-1] + F[i-2];       
        }   
       
        if(N<=70){
            System.out.println(N + "番目のフィボナッチ数：" + F[i-1]);
            System.out.println(N + "番目のフィボナッチ数列：" + Arrays.toString((F)));    
        }
        String C = scan.next();
        if(C.equals("exit") || C.equals("quit")){
            break;
        }
        }while (N<=70);
        
        scan.close();
        
    }        
}

