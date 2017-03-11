package com.junit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by deepdoradla on 11/03/2017.
 */
public class RunTest {

    public static void main(String[] args){

        Result result = JUnitCore.runClasses(SampleTest.class);
        for(Failure failure : result.getFailures()){
            System.out.println("Failure in testcase" + failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }


}
