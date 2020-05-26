package file_handle;

import java.util.HashMap;

public class Heads {
	public static String hd(String type) {
		HashMap <String,String> mine = new HashMap<String,String>();
		mine.put(".css", "text/css; charset=utf-8");
		mine.put(".mp3", "audio/mpeg; charset=utf-8");
		mine.put(".html", "text/html; charset=utf-8");
		mine.put(".jpg", "image/jpg; charset=utf-8");
		mine.put(".gif", "image/gif; charset=utf-8");
		if(mine.get(type).isEmpty()) {
			System.out.println("No such type");
		}
		return mine.get(type);
	}
}
