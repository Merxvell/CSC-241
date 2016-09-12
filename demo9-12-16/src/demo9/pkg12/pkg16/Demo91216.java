/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo9.pkg12.pkg16;

/**
 *
 * @author Merxv
 */
public class Demo91216 {

    /**
     * @param args the command line arguments
     */
    
     public static long fibonacci(int a) {
    if(a <= 1)
        return 1;
    else
        return fibonacci(a-1)+fibonacci(a-2);
    }
     
     public static long gcd(long m, long n){
         while(n != 0){
             long rem = m % n;
             m = n;
             n = rem;
         }
         return m;
     }
     
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fibonacci(5));
        System.out.println(gcd(40,20));
    }
    
    
    
}
