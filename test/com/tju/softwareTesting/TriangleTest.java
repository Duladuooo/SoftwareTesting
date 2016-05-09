package com.tju.softwareTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	private Triangle tri;
	
	@Before
	public void setup(){
		tri = new Triangle();
	}
	
	@After
	public void tearDown(){
		
	}
	
	@Test
	public void testJudgeTriangle() {
		assertEquals(-1, tri.judgeTriangle(3, 4, 8));
		assertEquals(0, tri.judgeTriangle(3, 3, 3));
		assertEquals(1, tri.judgeTriangle(4, 4, 7));
		assertEquals(2, tri.judgeTriangle(5, 6, 7));
	}

}
