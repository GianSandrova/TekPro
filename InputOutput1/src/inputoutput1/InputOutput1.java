package inputoutput1;
import java.util.*;

public class InputOutput1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); // Untuk membuat scanner baru
         String S = sc.nextLine();            // Untuk memasukkan input string
         String[] tokens = S.split("[ !,?.'@]"); //Untuk membagi String menjadi tokens
         int jumlahTokens = 0;
        
         for (int i=0; i<tokens.length; ++i) //menghitung jumlah token
             if (tokens[i].length() > 0) 
                 jumlahTokens++;
             
         System.out.println(jumlahTokens);  //menampilkan jumlah token ke layar
        
         for (int i=0; i<tokens.length;++i)    //membuat output dari tokens dan menampilkan ke layar dengan baris yang berbeda
             if (tokens[i].length() > 0)
                 System.out.println(tokens[i]);
    }
}
