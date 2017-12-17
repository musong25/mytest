package com.allenx.showSystemTimeTest;

import org.junit.Assert;

public class AssertSystemTime extends Assert {
	
	public static void assertSystemTime(String systemTime) {
		
		String timeFormat = "[12]\\d{3}-(0[1-9]|1[012])-([0][1-9]|[12]\\d|3[01]) ([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
		
		if (systemTime == null) {
			fail("System time is null");
		} else if (!systemTime.matches(timeFormat)) {
			fail("System time's format is wrong");
		}
	}
	
}
