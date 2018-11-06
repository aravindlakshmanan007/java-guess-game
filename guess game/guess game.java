/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udacity;

import static java.lang.Boolean.TRUE;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Aravind Lakshmanan
 */
public class Udacity {
public static void main(String arg[]){
int randomnumber=(int) (Math.random()*100) + 1,win = 0;
System.out.print("I have randomly choosen the number between 1 to 100");
System.out.print("Try to guess it");
for(int i=10;i>0;i--){
    System.out.print("You have "+i+" guesses remaining \n");
    Scanner scan=new Scanner(System.in);
    int guess=scan.nextInt();
    if(randomnumber<guess){
        System.out.print("It's smaller than "+guess+" guess..");
    }
    if(randomnumber>guess){
        System.out.print("It's greater than "+guess+" guess..");
    }
    if(randomnumber==guess){
        win=1;
        break;
    }
}
if(win==1)
    System.out.print("CONGRATS You win...:)");
else
    System.out.print("GAME OVER ..");
}
}