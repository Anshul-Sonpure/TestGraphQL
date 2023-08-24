import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class testSignUp {

    @Test
    public void SignUpTest()
    {
        String response = given().header("content-type", "application/json")
                      .body("{\"query\":\"mutation {\\n  signUp(username: \\\"AdminUser1\\\", password: \\\"Admin@User1\\\") {\\n    username\\n    authToken\\n  }\\n}\",\"variables\":null}")
                        .when().post("https://graphql-api-ppql.onrender.com/graphql")
                      .then().statusCode(200).extract().response().asString();
        System.out.println(response);
    }


}
