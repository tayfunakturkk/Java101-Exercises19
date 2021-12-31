package Loops.Exercises8;
import java.util.Scanner;
public class LoopExercises8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the n value:");
            int n=input.nextInt();
            for (int i = 1; i <= n ; i++) {
                 for (int k = 0; k< (n-i); k++) {
                    System.out.print(" ");                
                }
                for(int j = 1; j<=(2*i-1);j++){
                    System.out.print("*");
                }
                System.out.println(" "); 
            }
            for(int i=1;i<=n;i++){
                if(i==1){
                    continue;
                }
                for(int k=0;k<(i-1);k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*n-(2*i-1));j++){
                    System.out.print("*");

                }
                System.out.println(" ");
            }
        }
    }
}
