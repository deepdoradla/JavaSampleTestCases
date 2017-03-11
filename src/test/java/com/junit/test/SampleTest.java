/**
 * Created by deepdoradla on 11/03/2017.
 */

package com.junit.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.validator.*;

public class SampleTest {

    @Test
    public void testString(){
        String myString = "Hello this is my string!";

        Assert.assertEquals("Hello this is my string", myString);
    }

}
