/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notarius.notariuscesar;

/**
 *
 * @author François
 */
public class CesarCipher {
    
    private int decalage;

    public CesarCipher(int decalage) {
        this.decalage = decalage;
    }
    
    public String encipher (String entree) {
        char[] decode = entree.toCharArray();
        
        for (int i = 0; i < decode.length; i++) {
            if (Character.isLetterOrDigit(decode[i])) {
                decode[i] += decalage;
            }
        }
        
        return String.valueOf(decode);
    }
    
    public String decipher (String entree) {
        char[] decode = entree.toCharArray();
        
        for (int i = 0; i < decode.length; i++) {
            if (!Character.isWhitespace(decode[i])) {
                decode[i] -= decalage;
            }
        }
        
        return String.valueOf(decode);
    }
    
}
