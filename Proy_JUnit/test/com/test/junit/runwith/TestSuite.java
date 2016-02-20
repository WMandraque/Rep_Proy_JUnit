package com.test.junit.runwith;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.evaluation.TestEvaluationInteger;
import com.test.evaluation.TestEvaluationString;

@RunWith(Suite.class)
@SuiteClasses({TestEvaluationInteger.class, TestEvaluationString.class})
public class TestSuite
{

}
