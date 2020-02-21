package com.qa.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
@Test
public void recursionTest() {
	assertEquals(102334155, Runner.fibonacci(40));
}
@Test
public void iterationTest() {
	assertEquals(102334155, Runner.fibo(40));
}
}
