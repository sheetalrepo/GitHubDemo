package RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;
/**
 */
public class A2_Basic {


    /**
     * Then
     *  response body verification
     *  startsWith
     *  contains
     */
    @Test
    public void testStatusCode() {
        given()
           .get("http://jsonplaceholder.typicode.com/posts/11").
        then()
           .body("userId",equalTo(2))
           .body("id",equalTo(11))
           .body("title",startsWith("et ea vero quia"));
    }



}
