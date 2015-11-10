/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notarius.notariuscesar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author François
 */
public class CesarTest {
    
    

    @org.junit.Test
    public void testEncipher() {
        CesarCipher c = new CesarCipher(4);
        Assert.assertEquals("Lipps", c.encipher("Hello"));
        
        c = new CesarCipher(0);
        Assert.assertEquals("Hello", c.encipher("Hello"));
        
        c = new CesarCipher(-1);
        Assert.assertEquals("Ana fhudr 0//$ sn @khbd.", c.encipher("Bob gives 100$ to Alice."));
        
        c = new CesarCipher(1);
        Assert.assertEquals("[{:", c.encipher("Zz9"));
    }

    @org.junit.Test
    public void testDecipher() {
        CesarCipher c = new CesarCipher(4);
        Assert.assertEquals("Hello", c.decipher("Lipps"));
        
        c = new CesarCipher(0);
        Assert.assertEquals("Hello", c.decipher("Hello"));
        
        //non lettre ou chiffre orginal et encodé indiscernable l'un de l'autre
        /*c = new CesarCipher(-1);
        Assert.assertEquals("Bob gives 100$ to Alice.", c.decipher("Ana fhudr 0//$ sn @khbd."));*/
        
        c = new CesarCipher(1);
        Assert.assertEquals("Zz9", c.decipher("[{:"));
    }
    
}
