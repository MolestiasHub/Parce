package bytee;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Text2Byte implements Files2Bytes{
	public byte[] decode(File src) {
		String k= "It seems";
		try {
			k = Files.readString(src.toPath(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Nothing here");
			System.out.println(k);
		}
		return k.getBytes();
	}

}
