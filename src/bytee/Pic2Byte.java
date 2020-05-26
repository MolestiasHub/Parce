package bytee;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Pic2Byte implements Files2Bytes {

	public byte[] decode(File src) {
		byte [] k = {};
		try {
	   		k = Files.readAllBytes(src.toPath());
	   		}
	   		catch (IOException e){
	   			System.out.println("No file");
	   		}
		return k;
	}

}
