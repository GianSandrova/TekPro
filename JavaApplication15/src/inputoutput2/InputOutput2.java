package inputoutput2;
import java.util.Scanner;

public class InputOutput2 {

    public static void main(String[] args) {
            int x;
            String kata;
            String[]S=new String[3];
            int[]Integer=new int[3];
            
            Scanner sc=new Scanner(System.in); //membuat scanner
            
            for(int i=0;i<3;i++){  //membuat inputan dengan looping
                kata=sc.next();
                S[i]=kata;
                x=sc.nextInt();
                Integer[i]=x;
            }
            System.out.println("================================");
            for(int i=0;i<3;i++){
                System.out.printf("%-15s%03d%n",S[i],Integer[i]); //mencetak output dengan format sesuai yang diminta soal
              
            }
            System.out.println("================================");

    }
}
