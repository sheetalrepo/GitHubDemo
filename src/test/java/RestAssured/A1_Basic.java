package RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

/**
 *  Gherkin language BDD Cucumber
 *  Given  Pre Condition/Action
 *  When  Action
 *  Then  Result/Verification
 *
 *
 */
public class A1_Basic {


    /**
     * Given
     * Then
     */
    @Test
    public void testStatusCode() {
        given()
           .get("http://jsonplaceholder.typicode.com/posts/3").
        then()
            .statusCode(200)
            .log().all();
    }

    /**
     * Given
     * When
     * Then
     */
    @Test
    public void testStatusCodeWithWhen() {
        given().
        when()
           .get("http://jsonplaceholder.typicode.com/posts/3").
        then()
           .statusCode(200)
           .log()
           .all();
    }


    /**
     * When
     * Then
     */
    @Test
    public void testStatusCodeWithWhenThen() {
        when()
           .get("http://jsonplaceholder.typicode.com/posts/3").
        then()
           .statusCode(200)
           .log()
           .all();
    }


}
