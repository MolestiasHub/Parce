package bytee;

import java.io.File;
import java.util.HashMap;

public class Pathfinder {
	public static byte[] pathfinder(File src) {
		HashMap <String, Files2Bytes> mine = new HashMap<String, Files2Bytes>();
		String type = src.getAbsolutePath().substring(src.getAbsolutePath().lastIndexOf("."));
		mine.put(".css", new Text2Byte());
		mine.put(".mp3", new Sound2Byte());
		mine.put(".html", new Text2Byte());
		mine.put(".jpg", new Pic2Byte());
		mine.put(".gif", new Pic2Byte());
		mine.put(".png", new Pic2Byte());
		System.out.println(type);
		
		return mine.get(type).decode(src);
	}
}
