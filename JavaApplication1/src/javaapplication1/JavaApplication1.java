/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
         int maxNumber = 0; 
		 int previousNumber = 1;
		 int nextNumber = 1;
		 
		System.out.print("Masukkan angka = ");
	        Scanner scanner = new Scanner(System.in);
	        maxNumber = scanner.nextInt();
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
    }
 
}
