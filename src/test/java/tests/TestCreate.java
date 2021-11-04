package tests;

import io.restassured.response.Response;
import org.junit.Test;
import utilitity.*;
import model.PostRequest;

import java.util.Date;

import static org.apache.http.HttpStatus.SC_OK;
import static utilitity.Properties.*;

public class TestCreate extends BaseTests {

    private String baseUri = baseURL;

    @Test
    public void postCreateBooking()

    {
        PostRequest body = new PostRequest();
        body.setFirstname(firstname);
        body.setLastname(lastname);
        body.setLastname(lastname);
        body.setNumber(number);
        body.setDepositpaid(isPaid);
        body.setCheckin(checkIn);
        body.setCheckout(checkOut);
        body.setAdditionalneeds(additionalNeeds);
        Response response = calls.post(body);
        softly.assertThat(response.statusCode()).isEqualTo(SC_OK);
        softly.assertThat(response.jsonPath().get("status").toString()).isEqualTo("success");
        softly.assertThat(response.jsonPath().get("data.id").toString()).isNotNull();
        softly.assertAll();

    }
}
