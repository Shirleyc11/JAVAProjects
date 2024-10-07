/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.for3;

import java.util.Scanner;

/**
 *
 * @author Shirley1
 */
public class For3 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        
        int nu=scanner.nextInt();
        
        for( int i=1; i<=nu ;i++  ){
            
           System.out.println(i+"²="+(i*i));
            
            
            
            
            
            scanner.close();  
    }
        
        
        
    }
 }
