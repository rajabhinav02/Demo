import io.restassured.RestAssured;
import testing.payload;

import static io.restassured.RestAssured.*;

public class TestFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 RestAssured.baseURI= "https://reqres.in";
		 
		String response =  given().log().all().queryParam("page", "2").header("Content-Type","application/json")
		 .body(payload.Body()).when().get("api/users")
		 .then().log().all().assertThat().statusCode(200).extract().response().asString();
	}

}

