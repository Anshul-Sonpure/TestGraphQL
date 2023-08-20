import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class testPatchCall {

    @Test
    public void testPatchCall()
    {
        String response = given().header("content-type", "application/json")
                .body("{\"query\":\"mutation {\\n  updateUser(id:21, firstName: \\\"Denver\\\") {\\n    id\\n    firstName\\n    lastName\\n    email\\n    gender\\n    ipaddress\\n  }\\n}\",\"variables\":null}")
                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then().statusCode(200)
                .extract().response().asString();

        System.out.println(response);
    }
}
