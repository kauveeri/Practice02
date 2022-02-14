/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

import java.util.Random;
import java.util.Scanner;
import static practice.Subclass.SUITS;

/**
 *
 * @author Jassu01
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Subclass[] s = new Subclass[10];
       
       Random random= new Random();
       
       for (int i=0;i<s.length;i++){
           
           Subclass s1 = new Subclass ();
           s1.setNumbers(1+(int)(Math.random()*13));
               int randomNumber =s1.next(SUITS.length);
          s1.setSuit(SUITS[randomNumber]);
          
          System.out.println(s1.getNumbers() +" " + s1.getSuit());
           s[i] = s1;
   
       }
       
       // edit
    }
}
