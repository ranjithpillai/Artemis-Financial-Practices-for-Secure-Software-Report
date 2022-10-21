package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class ServerController{
	@RequestMapping("/hash")
	public String myHash(){
		String data = "Hello World Check Sum - Ranjith Mohanan Pillai!";
		String hashValue = generateSecuredHash(data);
		return "<p>data:"+data+"<br/>" +
				"Name of Cipher Algorithm used: SHA-256 <br/>" +
				"Hash value: "+hashValue+"</p>";
	}

	private String generateSecuredHash(String data) {
		StringBuilder hexString = new StringBuilder();
		try {
			// create message digest object
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			// generate secure hash
			byte[] encodedHash = messageDigest.digest(data.getBytes(StandardCharsets.UTF_8));

			// convert to hex string
			for (int i = 0; i < encodedHash.length; i++) {
				final String hex = Integer.toHexString(0xff & encodedHash[i]);
				if(hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}
		} catch(NoSuchAlgorithmException nsae) {
			// printing stack trace in case of error since no logger in configured
			nsae.printStackTrace();
		}
		return hexString.toString();
	}
}