/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationxx;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a2015
 */
public class JavaApplicationxx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// write your code here
        Scanner sc= new Scanner(System.in);
        boolean end = false;
        System.out.println("--- MENU PRINCIPAL ---");
        System.out.println("");



        while(!end)
        {
            System.out.println("1) **LLENAR**");
            System.out.println("2) **LLENAR**");
            System.out.println("3) **LLENAR**");
            System.out.println("4) SALIR ");
            System.out.println("Opcion: ");
            String a=sc.nextLine();
            switch(a)
            {
                case "1":
                {
                    break;
                }
                case "2":
                {
                    break;
                }
                case "3":
                {
                    break;
                }
                case "4":
                {
                    end = true;
                }
                default:
                {
                    System.out.println("Opcion no valida :c ");
                    end=true;
                }
            }
        }
    }
    
}
