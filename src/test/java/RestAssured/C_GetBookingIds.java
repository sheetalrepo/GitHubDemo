package RestAssured;

import io.restassured.RestAssured;
//import org.openqa.selenium.devtools.v122.fetch.model.AuthChallengeResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import java.util.List;

public class C_GetBookingIds {
    @Test
    public void GetBookingIds(){
        //get response with booking IDs
        //Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking");
        Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking");
                response.print();
        Assert.assertEquals(response.getStatusCode(),200,"Status code should be 200, but its not");

        List<Integer> BookingIds = response.jsonPath().getList("BookingIds");

        Assert.assertFalse(BookingIds.isEmpty(),"List of BookingIds is empty, but it should not be");

    }


}
