package loginapi;

import org.testng.annotations.Test;

import com.api.model.request.LogiRequest;
import com.api.model.response.LoginResponse;

import api.baseservice.Authservice;
import api.baseservice.UserManageMnetService;
import io.restassured.response.Response;

public class GetProfileTest {

	@Test
	public void getprofile()
	{
		
		Authservice authservice=new Authservice();
		Response response=authservice.login(new LogiRequest("uday123","udat123"));
		LoginResponse loginResponse=response.as(LoginResponse.class);
		String token=loginResponse.getToken();
		System.out.println(token);
		
		UserManageMnetService userManageMnetService=new UserManageMnetService();
		response=userManageMnetService.getprofile(loginResponse.getToken());
		System.out.println(response);
	}
}
