package org.nijj.imac.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTool {
	public String getDateTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		String date = sdf.format(now);
		return date;
	}

}
