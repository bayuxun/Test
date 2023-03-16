import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minl=0, pminl=0, maxl=0, pmaxl=0;
        for(int i = 1; i <= n; i++){
            int t = sc.nextInt();
            if(i == 1){
                minl = maxl = t;
                pminl = pmaxl = 1;
            }else{
                int x = Math.abs(minl-t), y = Math.abs(maxl-t);
                if(x <= y){
                    System.out.print(x+" "+pminl);
                }else{
                    System.out.print(y+" "+pmaxl);
                }
                if(maxl < t){
                    maxl = t;
                    pmaxl = i;
                }
                if(minl > t){
                    minl = t;
                    pminl = i;
                }
                System.out.println();
            }
        }
    }
}