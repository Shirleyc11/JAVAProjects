/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.for2;


import java.util.Scanner;

/**
 *
 * @author Shirley1
 */
public class For2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        
   
       System.out.print("Digite um numero: ");
        int nu= scanner.nextInt();
        
        
        for ( int i=1; i<=11 ; i++ ){
            System.out.println(i+"x"+nu+"="+(nu*i));
     
       scanner.close();
    
        }   
    }
        
    }

   