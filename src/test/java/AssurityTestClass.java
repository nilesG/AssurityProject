import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;

public class AssurityTestClass {
        //Test method to verify the acceptance criteria for the given EndPoint
    @Test
    public void assurityTests() {

        // Test1 : To validate the name , reList and Description tag in the GET Response.

        //Making a GET Request to the endpoint.
        RestAssured.baseURI = "https://api.tmsandbox.co.nz/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("v1/Categories/6327/Details.json?catalogue=false");

        //Capturing the response values and storing the values in  local variables
        JsonPath jsonPathEvaluator = response.jsonPath();
        String name = jsonPathEvaluator.get("Name");
        Boolean reList = jsonPathEvaluator.get("CanRelist");
        String Description = jsonPathEvaluator.get("Promotions[1].Description");

        // Asserting the 3 fields in the JSON Response to validate the Acceptance Criteria
        Assert.assertEquals(name, "Carbon credits");
        Assert.assertEquals(reList, true);
        Assert.assertThat(Description, containsString("2x larger image"));

    }
}

