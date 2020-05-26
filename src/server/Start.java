package server;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import file_handle.DeliveryClub;
import file_handle.MyHttp;
import file_handle.YandexEda;

public final class Start implements ServerStart{
	public void starter (String Host, int Port, int attempts) throws IOException  {
		System.out.println(Host + ": " + Port);

		HttpServer server = HttpServer.create(new InetSocketAddress(Host,Port), attempts);
		server.createContext("/src",new MyHttp());
		server.createContext("/static", new DeliveryClub());
		server.createContext("/static/Gachi_less_than_3/d.gif", new YandexEda());
		server.setExecutor(null);
		server.start();
		
		System.out.println("Server started on port:" + Port);

	}
	

}
