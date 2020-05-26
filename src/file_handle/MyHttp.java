package file_handle;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import bytee.Files2Bytes;
import bytee.Pathfinder;
import server.Responder;


public class MyHttp implements HttpHandler{
	public void handle(HttpExchange httpExchange) throws IOException {
		OutputStream outputStream = httpExchange.getResponseBody();
	   	Headers headers = httpExchange.getResponseHeaders();
	   	headers.set("Content-Type", "text/html; charset=utf-8");
	   	File hui = new File ("src/public/hey.html");

	   	byte [] response = Pathfinder.pathfinder(hui);
        Responder.resp(200, response, outputStream, httpExchange);
	   	System.out.println("done");  
	  }
}
