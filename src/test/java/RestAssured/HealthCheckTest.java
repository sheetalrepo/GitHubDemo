package RestAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;


public class HealthCheckTest {
//    @Test
//    public void healthCheckTest() {
//        RequestSpecification spec = new RequestSpecBuilder().
//                setBaseUri("https://restful-booker.herokuapp.com").
//                build();
//
//        //RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com");
//        given().spec(spec).
//                when().get("https://restful-booker.herokuapp.com/ping").
//                then().
//                asserthat().
//                statuscode(201);
//
//
//    }


}
