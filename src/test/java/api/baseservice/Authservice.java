package api.baseservice;



import java.util.HashMap;

import com.api.model.request.LogiRequest;
import com.api.model.request.SignupRequest;

import io.restassured.response.Response;

public class Authservice extends BaseService{
	private final static String BASE_PATH="/api/auth/";
	
	public Response login(LogiRequest payload)
	{
		return postrequest(payload,BASE_PATH+"login");
	}
	
	public Response signup(SignupRequest payload)
	{
		return postrequest(payload,BASE_PATH+"signup");
	}
	
	public Response forgotpasswprd(String emailadress)
	{
		HashMap<String ,String> payload=new HashMap<String,String>();
		return postrequest(payload,BASE_PATH+"forgot-password");
	}

}
