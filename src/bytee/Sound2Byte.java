package bytee;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound2Byte implements Files2Bytes {

	@Override
	public byte[] decode(File src) {
		byte[] k = {};
		AudioInputStream is;
		try {
			is = AudioSystem.getAudioInputStream(src);
		
		DataInputStream dis = new DataInputStream(is);
		
		    AudioFormat format = is.getFormat();
		    k = new byte[(int)(is.getFrameLength() * format.getFrameSize())];
		    dis.readFully(k);
		    dis.close();
		}
		catch (UnsupportedAudioFileException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return k;
	}

}
