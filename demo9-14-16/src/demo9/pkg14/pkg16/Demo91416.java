/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo9.pkg14.pkg16;

import java.util.*;

/**
 *
 * @author Merxv
 */
public class Demo91416 {

    /**
     * @param args the command line arguments
     */
    //advantage of linked list over array list
    //faster insertion and removal even in large scales
    //disadvantages
    //can't go directly to a part of the index, 
    //has to go through all items
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedList backwardList = new LinkedList();
        LinkedList forwardList = new LinkedList();
        LinkedList temp = null;
        int number; //from user
        int sum = 0;

        System.out.println("Input 4 numbers");
        for (int i = 0; i < 4; i++) {
            number = scan.nextInt();
            backwardList.addFirst(number);
            forwardList.add(number);
            System.out.println(backwardList);
            System.out.println(forwardList);
            sum += number;
        }
        System.out.println(backwardList);
        System.out.println(forwardList);
        System.out.println("sum: " + sum);
        System.out.println("Use get to traverse list");
        
        for(int j=0; j<4; j++){
            System.out.print(backwardList.get(j) + " " );//really uses next links
        }
        
        System.out.println(" ");
        
        for(int k=0;k<4;k++){
              System.out.print(forwardList.get(k) + " " );
        }
        
        System.out.println(" ");
        
        //now use temp
        temp = backwardList; System.out.println(temp);
        temp = forwardList; System.out.println(temp);
    }

}
