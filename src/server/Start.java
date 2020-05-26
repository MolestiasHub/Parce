package server;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public final class Start implements ServerStart{
	public void starter (String IP, int Port, int attempts) throws IOException  {
		System.out.println(IP + " " + Port + " " + attempts);

		HttpServer server = HttpServer.create(new InetSocketAddress(IP,Port), attempts);
		server.createContext("/src",new MyHttp());
		server.createContext("/static", new DeliveryClub());
		server.setExecutor(null);
		server.start();
		
		System.out.println("Server started on port " + Port);

	}
	

}
