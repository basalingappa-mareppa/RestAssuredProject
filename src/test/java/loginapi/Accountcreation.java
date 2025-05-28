package loginapi;

import org.testng.annotations.Test;

import com.api.model.request.SignupRequest;

import api.baseservice.Authservice;
import io.restassured.response.Response;

public class Accountcreation {
	@Test(description="verify the accountfunctionality functionality")
	public void acountcreation()
	{
		SignupRequest signupRequest=new SignupRequest.Builder().firstName("basalingap")
		.email("basa@12gmail.com")
		.lastName("dish23")
		.mobileNumber("9984776735")
		.username("dish")
		.password("we2321")
		.build();
		Authservice authservice=new Authservice();
		Response response=authservice.signup(signupRequest);
		System.out.println(response);
	}

}
