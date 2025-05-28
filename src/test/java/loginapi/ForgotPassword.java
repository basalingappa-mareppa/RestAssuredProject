package loginapi;

import org.testng.annotations.Test;

import api.baseservice.Authservice;
import io.restassured.response.Response;

public class ForgotPassword {

	
	@Test
	public void forgotpassword()
	{
		Response response=authservice.forgotpasswprd("basalin@123gmail.com");
	}
	Authservice authservice=new Authservice();

	
}
