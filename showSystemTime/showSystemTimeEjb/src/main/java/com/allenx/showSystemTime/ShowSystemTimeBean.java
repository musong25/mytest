package com.allenx.showSystemTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.Stateless;

@Stateless
public class ShowSystemTimeBean implements ShowSystemTime {

	public String showSystemTime() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date currentTime = new Date();
		
		String systemTime = dateFormat.format(currentTime);
		
		return systemTime;
		
	}

}
