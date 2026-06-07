package RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class B_HerokuApp {
    @Test
    public void healthCheckTest() {
        given().when()
                .get("https://restful-booker.herokuapp.com/ping")
                .then().
                assertThat()
                .statusCode(201).log().all();
    }
}


