package com.junit.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by deepdoradla on 12/03/2017.
 */
public class TestClass2 {

    String message = "This is testclass 2 test message. Haa ha";

    @Test
    public void testMessage(){
        System.out.println("I am in testMessage of testClass2!");

        Assert.assertEquals("This is testclass 2 test message. Haa ha", message);
    }
}
