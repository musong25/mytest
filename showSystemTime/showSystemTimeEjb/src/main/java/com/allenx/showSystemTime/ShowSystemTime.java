package com.allenx.showSystemTime;

import javax.ejb.Remote;

@Remote
public interface ShowSystemTime {

	public String showSystemTime();
}
