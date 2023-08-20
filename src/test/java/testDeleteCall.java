import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class testDeleteCall {

    @Test
    public void testDeleteCall()
    {
        String response = given().header("content-type","application/json")
                .body("{\"query\":\"mutation {\\n  deleteUser(id: 24) {\\n    id\\n    firstName\\n    lastName\\n    email\\n    gender\\n    ipaddress\\n  }\\n}\",\"variables\":null}")
                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then().extract().response().asString();

        System.out.println(response);
    }
}
