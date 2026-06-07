package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C_UpdateBookingTests {
//    @Test
//    public void UpdateBookingTests(){
//        //create booking
//
//        Response response = C_CreateBookingTests;
//                response.print();
//        // Get Booking id of new booking
//        int bookingid = response.jsonPath().getInt("bookingid");
//
//        //create json body
//        JsonObject body = new JSONObject();
//        body.put("firstname", "olga");
//        body.put("lastname", "olga");
//        body.put("totalprice", "100");
//        body.put("depositpaid", "true");
//
//        JSONObject bookingdates = new JSONObject();
//        bookingdates.put("checkin", "2021-11-05");
//
//
//
//        //update booking
//        response responseUpdate = RestAssured.given().auth().preemptive().basic("admin","password123").contentType(ContentType.JSON).body(body.toString()).put("https://restful-booker.herokuapp.com/booking" + bookingid);
//        responseUpdate.print();
//
//        //"username" = "admin"
//        // "password" = "password123"
//
//        // verification
//        Assert.assertEquals(response.getStatusCode(),200,"Status code should be 200, but its not");
//
//        // verify all fields
//        SoftAssert softAssert = new SoftAssert();
//        String firstName = response.jsonPath().getString("firstname");
//        softAssert.assertEquals(firstName, "Ericsson");
//
//        String lastName = response.jsonPath().getString("lastname");
//        softAssert.assertEquals(lastName, "Jackson");
//
//        int totalPrice = response.jsonPath().getInt("totalprice");
//        softAssert.assertEquals(totalPrice, 495);
//
//        boolean depositPaid = response.jsonPath().getBoolean( "depositpaid");
//        softAssert.assertTrue(depositPaid);
//
//       String checkinDates = response.jsonPath().getString("bookingdates");
//       softAssert.assertEquals(checkinDates, "2021-11-05");
//
//        softAssert.assertAll();
//    }


}
