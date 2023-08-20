import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.text.MatchesPattern.matchesPattern;
public class TestGetCall {

    @Test
    public void testGetCall()
    {
        String response = given().header("content-type","application/json")
                .body("{\"query\":\"query{\\n  getAllUsers{\\n    firstName,id\\n  }\\n}\",\"variables\":null}")
                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then().extract().response().asString();
        System.out.println(response);
        // We will create JsonPath Object to fetch data
        JsonPath path = new JsonPath(response);
        Object firstName = path.get("data.getAllUsers.firstName");
        //Print All the First Name
        System.out.println(firstName);

    }

    //In below test method we will validate for multiple FirstName present in response and
    // in similar way we can validate other fields in response
    @Test
    public void ValidateMultipleContent()
    {
        String response = given().header("content-type","application/json")
                .body("{\"query\":\"query{\\n  getAllUsers{\\n    firstName,id\\n  }\\n}\",\"variables\":null}")
                .when().post("https://graphql-api-ppql.onrender.com/graphql")
                .then()
                .assertThat()
                .body("data.getAllUsers.firstName",hasItems("Wilbur","Oriana","Brade","Sebastian"))
                        .statusCode(200).toString();

    }


}
