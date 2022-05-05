package com.wikidreams.websocket.controller;

import java.io.FileOutputStream;
import java.io.InputStream;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class RestDownloadTest {

	public static void main(String[] args) throws Exception {
		
		// https://stackoverflow.com/questions/29712554/how-to-download-a-file-using-a-java-rest-service-and-a-data-stream
		
		SSLContext sc = SSLContext.getInstance("TLSv1");//Java 8
 

        //TrustManager[] trustAllCerts = { new TrustManager() };
        //sc.init(null, trustAllCerts, new java.security.SecureRandom());
			
        Client client = ClientBuilder.newBuilder().sslContext(sc).build();
        String url = "https://localhost:8443/WebSocket-0.0.1-SNAPSHOT/down";
        
        Response response = client
        		.target(url)
        		.request()
        		.get();
        
        String location = "d";
        FileOutputStream out = new FileOutputStream(location);
        InputStream is = (InputStream)response.getEntity();
        int len = 0;
        byte[] buffer = new byte[4096];
        while((len = is.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        out.flush();
        out.close();
        is.close();
    }
	
	
	
}
