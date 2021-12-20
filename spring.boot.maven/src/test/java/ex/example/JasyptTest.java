package ex.example;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

public class JasyptTest {

	@Test
	public void test() {
		
    	final String algorithm = System.getenv().get("jasypt.encryptor.algorithm"); 
        final String password = System.getenv().get("jasypt.encryptor.password");
        
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
		pbeEnc.setAlgorithm(algorithm);
		pbeEnc.setPassword(password);
		
		String text = "Test";
		String enc = pbeEnc.encrypt(text);
		String des = pbeEnc.decrypt(enc);
				
		System.out.println(enc);
		System.out.println(des);		
        
	}

}