package com.test.junit.runwith;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.evaluation.TestEvaluationDouble;

@RunWith(Suite.class)
@SuiteClasses({TestSuite.class, TestEvaluationDouble.class})
public class TestAll
{

}
