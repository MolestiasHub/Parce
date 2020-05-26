package server;

import java.io.IOException;

public interface ServerStart {
	public void starter(String ip, int port, int attempts) throws IOException;
	
	
}
