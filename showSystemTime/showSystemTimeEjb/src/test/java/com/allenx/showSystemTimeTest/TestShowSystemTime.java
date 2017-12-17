package com.allenx.showSystemTimeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.allenx.showSystemTime.ShowSystemTime;
import com.allenx.showSystemTime.ShowSystemTimeBean;
import static com.allenx.showSystemTimeTest.AssertSystemTime.*;

public class TestShowSystemTime {
	
	@Before
	public void setUp() {
		System.out.println("start to get system time");
	}
	
	@After
	public void tearDown() {
		System.out.println("end test");
	}
	
	@Test
	public void testShowSystemTime() {
		
		ShowSystemTime showSystemTime = new ShowSystemTimeBean();
		
		String systemTime = showSystemTime.showSystemTime();
		
		assertSystemTime(systemTime);
		
		System.out.println("The system time is "+systemTime);
	}
}
