package se.idioti.example.jaxws.soap.client;

import java.net.URL;
import javax.xml.ws.Service;

import se.idioti.example.jaxws.soap.server.Karaoke;

import javax.xml.namespace.QName;

/**
 * A very simple SOAP client.
 * 
 * @author "Johan Holmberg, Malmö university"
 * @since 1.0
 */
public class KaraokeClient {
	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:9999/ws/song?wsdl");
		
		// The first argument is a service URI. It matches the package name of the server.
		// The second argument is a service name, which refers to the wsdl document from above-
		QName qname = new QName("http://server.soap.jaxrs.example.idioti.se/", "KaraokeImplService");

		Service service = Service.create(url, qname);
		Karaoke karaoke = service.getPort(Karaoke.class);

		String response = karaoke.getSongAsString("Let it go");
		
		System.out.println(response);

	}
}
