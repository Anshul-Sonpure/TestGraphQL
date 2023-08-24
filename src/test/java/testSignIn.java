import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class testSignIn {

    @Test
    public void SignInTest()
    {
        String response = given().header("content-type", "application/json")
                .body("{\"query\":\"mutation {\\n  signIn(username: \\\"AdminUser1\\\", authToken: \\\"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6IkFkbWluVXNlcjEiLCJpYXQiOjE2OTI4NjgwMTh9.rfHb6DlO_fB8DKxxjtRSAqFvwtWSHHZDMqNMunmqfpM\\\")\\n}\",\"variables\":null}")
                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then().statusCode(200).extract().response().asString();
        System.out.println(response);
    }
}
