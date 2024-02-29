package projeto.rest.test;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyTest {
	
	Response response;
	@Test
	public void validarTest() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals(200, response.statusCode());
	}
		
	
	@Test
	public void validarTest1() {
		response = RestAssured.get("https://reqres.in/api/users?page=2");
		assertEquals(200, response.statusCode());
	}

}
