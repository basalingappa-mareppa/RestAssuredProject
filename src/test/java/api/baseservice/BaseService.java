package api.baseservice;

import static io.restassured.RestAssured.*;

import com.api.model.request.LogiRequest;

import io.restassured.response.*;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private final static String BASE_URL = "http://64.227.160.186:8080";
	private RequestSpecification requestspecification;
	
	public BaseService()
	{
		requestspecification=given().baseUri(BASE_URL);
	}
	
	protected Response postrequest(Object payload,String endpoint)
	{
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
}
