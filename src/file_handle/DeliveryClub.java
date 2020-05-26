package file_handle;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import bytee.Pathfinder;
import server.Responder;

public class DeliveryClub implements HttpHandler {
	public void handle(HttpExchange exchange) throws IOException {
		handleResponse(exchange);  
	}
	private void handleResponse(HttpExchange httpExchange) {
		String str = httpExchange.getRequestURI().getPath();
		System.out.println(str);
		str = "src/public" + str.substring(str.lastIndexOf("/"),str.length());
	   	OutputStream outputStream = httpExchange.getResponseBody();
	   	Headers headers = httpExchange.getResponseHeaders();
	   	File src = new File (str);
	   	String type = str.substring(str.lastIndexOf("."), str.length());
	   	byte[] response = Pathfinder.pathfinder( src); 
	   	Responder.resp(200, response, outputStream, httpExchange);
	   	if (Heads.hd(type).isEmpty()) {
	   		System.out.println("Type is not supported");
	   		}
	   	else {
	   		type = Heads.hd(type);
	   	}
	   	headers.set("Content-Type", type);
	}
}
