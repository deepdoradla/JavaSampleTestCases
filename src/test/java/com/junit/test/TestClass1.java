package com.junit.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by deepdoradla on 12/03/2017.
 */
public class TestClass1 {

    String message = "Hello";

    @Test
    public void testMessage(){

        System.out.println("I am in testmessage!");

        Assert.assertEquals("Hello", message);
    }
}
