/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.notarius.notariuscesar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author François
 */
public class MainCmd {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cesar cypher");
        
        System.out.print("Entrer le nombre a décaler: ");
        
        try {
            int decalage = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Entrer votre message à encoder: ");

            String message = scanner.nextLine();

            CesarCipher cesar = new CesarCipher(decalage);
            
            String sortie = cesar.encipher(message);

            System.out.println("votre message encodé : " + sortie);
            
        } catch (InputMismatchException e) {
            System.out.println("Entrer un nombre réel");
        }
        
        
        
    }
    
}
