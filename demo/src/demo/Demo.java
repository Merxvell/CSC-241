/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Merxv
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.println("the recursive method is over");
                double a = Math.log(i) / Math.log(2);
                System.out.println(a);
                double b = a * a;
                double c = a * i;
                double d = Math.pow(2, i);
                int ai = (int) a, bi = (int) b, ci = (int) c;
                long di = (long) a;
                System.out.println(ai + "\t" + bi + "\t" + ci + "\t" + i * i + "\t" + i * i * i + "\t\t" + di);
                System.out.println("\n");
            } else {
                System.out.println("the recursive method is on " + i);
                double a = Math.log(i) / Math.log(2);
                System.out.println(a);
                double b = a * a;
                double c = a * i;
                double d = Math.pow(2, i);
                int ai = (int) a, bi = (int) b, ci = (int) c;
                long di = (long) a;
                System.out.println(ai + "\t" + bi + "\t" + ci + "\t" + i * i + "\t" + i * i * i + "\t\t" + di);
                System.out.println("\n");
            }
        }
        /*
        if you want to take the log of base 2
        Math.log(i)/Math.log(2)
        this converts from base 0 to base 2
         */
    }

}
