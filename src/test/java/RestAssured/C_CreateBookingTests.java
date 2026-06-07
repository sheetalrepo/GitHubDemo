package RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C_CreateBookingTests {
    @Test
    public void GetBookingTests(){
        //get response with booking IDs
        //Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking");
        Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking/5");
                response.print();
        Assert.assertEquals(response.getStatusCode(),200,"Status code should be 200, but its not");

        // verify all fields
        SoftAssert softAssert = new SoftAssert();
        String firstName = response.jsonPath().getString("firstname");
        softAssert.assertEquals(firstName, "Ericsson");

        String lastName = response.jsonPath().getString("lastname");
        softAssert.assertEquals(lastName, "Jackson");

        int totalPrice = response.jsonPath().getInt("totalprice");
        softAssert.assertEquals(totalPrice, 495);

        boolean depositPaid = response.jsonPath().getBoolean( "depositpaid");
        softAssert.assertFalse(depositPaid);

       String checkinDates = response.jsonPath().getString("bookingdates");
       softAssert.assertEquals(checkinDates, "2021-11-05");

        softAssert.assertAll();
    }


}
