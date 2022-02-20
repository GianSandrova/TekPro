package berhitung;
import java.util.*;


public class Berhitung {


    public static void main(String[] args) {
      int A,B,hasil;
      char operator;
      
      Scanner sc=new Scanner(System.in); //untuk membuat scanner
      A=sc.nextInt();                    //scanner untuk inputan angka integer
      operator=sc.next().charAt(0);      //scanner untuk inputan char
      B=sc.nextInt();                    //scanner untuk inputan angka integer ke2 
      
      if((A>=1 && A<=1000)&&(B>=1 && B<=1000)){ //menentukan batas angka inputan
          if(operator== '+'){                   //untuk penjumlahan
              hasil=A+B;
              System.out.println(hasil);
          }
          else if(operator=='-'){              //pengurangan
              hasil=A-B;
              System.out.println(hasil);
          }
          else if(operator=='*'){              //perkalian
              hasil=A*B;
              System.out.println(hasil);
          }
          else if(operator=='/'){              //pembagian
              hasil=A/B;
              System.out.println(hasil);
          }
          else if(operator=='%'){              //modulus
              hasil=A%B;
              System.out.println(hasil);
          }
          else{
             System.out.println("Salah operator"); 
          }
    }
      else{
          System.out.println("Salah inputan");
      }
    }
}