package api.baseservice;

import io.restassured.response.Response;

public class UserManageMnetService extends BaseService{
	
	private static final String BASE_PATH = "/api/auth/";
	
	public Response getprofile(String token)
	{
		setauthtoken(token);
		return getrequest(BASE_PATH+"profile");
	}

}
