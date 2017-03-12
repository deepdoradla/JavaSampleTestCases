package com.junit.test;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by deepdoradla on 11/03/2017.
 */
public class TestFixtures extends TestCase{

    //Fixtures have setUp and tearDown methods. setUp helps construct the values before the test begins. This is highly useful for repeated and reusable tests

    protected int a,b;

    @Override
    public void setUp() throws Exception {

        a = 20;
        b = 30;

    }

    public void testMethod() throws Exception {

        int addition = a+b;
        Assert.assertTrue(addition == 40);

    }
}
