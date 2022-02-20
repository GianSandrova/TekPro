package bukatutupjalan;
import java.util.*;
import java.util.Arrays;


public class BukaTutupJalan {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //membuat scanner
        
        int[]angka=new int[4]; //membuat array
        
        for(int i=0;i<4;i++){     //menginput angka ke dalan array
           angka[i]=sc.nextInt(); 
        }
        String S=Arrays.toString(angka).replaceAll("\\[|\\]|,|\\s", ""); //syntax untuk mengkonversi Array ke String
        
        long num=Long.parseLong(S);  //mengubah String menjadi long
        
        if((num-999999)%5==0){            //modulus untuk menentukan apakah angka habis dibagi 5,jika iya mobil akan jalan,jika tidak mobil akan berhenti
            System.out.println("jalan");
        }
        else{
            System.out.println("berhenti");
        }
    
 }
}   

