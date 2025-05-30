package loginapi;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.model.request.LogiRequest;
import com.api.model.response.LoginResponse;

import api.baseservice.Authservice;
import io.restassured.response.Response;


@Listeners(com.api.lesteners.ListenersTest.class)
public class Logintest {

	
	@Test(description="verify the login functionality")
	public void login()
	{
		LogiRequest loginrequest=new LogiRequest("uday123","uday123");
		Authservice loginn=new Authservice();
		Response res=loginn.login(loginrequest);
		LoginResponse loginResponse=res.as(LoginResponse.class);
		
		System.out.println(res.asPrettyString());
		System.out.println(loginResponse.getUsername());
	}
}
