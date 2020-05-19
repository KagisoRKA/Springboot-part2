package com.springboot.part2;

import com.springboot.part2.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserServiceImplTest {
	@LocalServerPort
	private int port;
	@Autowired
    UserService userService;
	@Autowired
	private TestRestTemplate template;

	private URL baseUrl;

	@BeforeEach
	public void urlLink()throws Exception{
		this.baseUrl=new URL("http://localhost:"+port);
	}
	@Test
	public void AuthenRequest()throws Exception{
		ResponseEntity<String> respnse = template.withBasicAuth("Kagiso_007","r@wP9sswrd").getForEntity(baseUrl.toString(),String.class);
	}
	@Test
	void cacheTest() {
		String add = userService.addUser(1,"Kagiso","Raseroka");
		String newUser = userService.getUser(1);
		String newUser2 = userService.getUser(1);
		String newUser3 = userService.getUser(1);
		System.out.println(newUser+" "+newUser2+" "+newUser3);
	}
}
