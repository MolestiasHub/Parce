package server;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;

public class Responder {
	public static void resp (int code, byte[] File, OutputStream outputStream, HttpExchange httpExchange) {
		try {
		httpExchange.sendResponseHeaders(code, File.length);
        outputStream.write(File);
        outputStream.flush();
        outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}