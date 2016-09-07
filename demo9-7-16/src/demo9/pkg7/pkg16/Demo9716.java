/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo9.pkg7.pkg16;

/**
 *
 * @author Merxv
 */
public class Demo9716 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fibonacci - iterative, 
        long first = 1, second = 1, third;
        double ratio;
        for (int i = 2; i <= 50; i++) {
            third = first + second;
            ratio = (double)third/second;
            long low=(long)Math.pow(1.5,i);
            long high=(long)Math.pow(1.66,i);
            System.out.println(i + " " + third + " " + ratio + " " + low + " " + high);
            first = second;
            second = third;
        }
        System.out.println((1+Math.sqrt(5))/2);
        //FUCKING KILL ME WHY IS HE SO MONOTONE
        //WHY THE FUCK DOES HE USE JGRASP, WHY NOT USE AN IDE THAT ISN'T IDIOTIC

    }

}
