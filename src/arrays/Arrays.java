/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Meet
 */
public class Arrays {
    //comment added
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ENter Your Words: ");
        Scanner input = new Scanner(System.in);
        String newWord = input.nextLine();
        char[] newLetter = new char[newWord.length()];
        
        for(int i=0; i<newLetter.length;i++){
            newLetter[i] = newWord.charAt(i);
            System.out.println(newLetter[i]);
        }
        
        System.out.println();
        System.out.println("Printing in Reverse");
        for(int i=newLetter.length-1;i>=0;i--){
            System.out.println(newLetter[i]);
        }
    }
        }
        
            
        
        
        
        
    }
    
}
