package bignumber;
import java.util.*;
import java.math.BigInteger;

public class BigNumber {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);          //membuat scanner
        BigInteger A=new BigInteger(sc.nextLine()); //inputan user
        BigInteger B=new BigInteger(sc.nextLine()); //inputan user kedua
        BigInteger penjumlahan=A.add(B);            //syntax penjumlahan untuk big integer
        BigInteger perkalian=A.multiply(B);         //syntax perkalian untuk big integer
        
        System.out.println(penjumlahan);
        System.out.println(perkalian);
    }
    
}
