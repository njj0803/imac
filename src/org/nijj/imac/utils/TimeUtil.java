package org.nijj.imac.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	public String getDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		String date = sdf.format(now);
		return date;
	}

}
