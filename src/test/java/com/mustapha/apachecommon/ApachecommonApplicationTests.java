package com.mustapha.apachecommon;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApachecommonApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void commonIo() throws IOException {
		String initialString = "Hello World!";
		try(InputStream inputStream = new ByteArrayInputStream(initialString.getBytes());
			ByteArrayOutputStream targetStream = new ByteArrayOutputStream()){
			IOUtils.copy(inputStream,targetStream);
			assertEquals(initialString, new String(targetStream.toByteArray()));
		}
	}

}
