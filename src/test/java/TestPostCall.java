import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestPostCall {
    String response;
    @Test
    public void testPostCall() {
        response = given().header("content-type", "application/json")
                .body("{\"query\":\"mutation{\\n  createUser(firstName:\\\"Henry\\\",lastName:\\\"Ford\\\",gender:\\\"Male\\\",ipaddress:\\\"211.111.132.117\\\",email:\\\"tester@yahoo.com\\\")\\n  {firstName,lastName\\n    \\n  }\\n}\",\"variables\":null}")
                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then().statusCode(200)
        .extract().response().asString();

        System.out.println(response);
    }
}
