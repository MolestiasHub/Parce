package server;

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


public class MyHttp implements HttpHandler{
	public int str = 0;
	public void handle(HttpExchange httpExchange) throws IOException {
		
	    //requestParamValue = handleGetRequest(httpExchange);
	    handleResponse(httpExchange);   
	  }
	   private void handleResponse(HttpExchange httpExchange)  {
		   	OutputStream outputStream = httpExchange.getResponseBody();
		   	Headers headers = httpExchange.getResponseHeaders();
		   	String type = httpExchange.getRequestURI().getPath();
		   	headers.set("Content-Type", "text/html; charset=utf-8");
		   	File hui = new File ("src/public/hey.html");

		   	byte [] response = Pathfinder.pathfinder(".html", hui);
		   	
		    str = str ++;
		   	System.out.println("Req num:" + str);
           
            try {
				httpExchange.sendResponseHeaders(200, response.length);
				outputStream.write(response);
	            outputStream.flush();
	            outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   	System.out.println("done");
            
        }
}
