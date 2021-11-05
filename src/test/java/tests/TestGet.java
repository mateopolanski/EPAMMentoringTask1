package tests;

import org.junit.jupiter.api.Test;
import utilitity.BaseTests;

import static org.apache.http.HttpStatus.SC_OK;

public class TestGet extends BaseTests {

    @Test
    public void getEmployees() {
        response = calls.get();
        softly.assertThat(response.statusCode()).isEqualTo(SC_OK);
        softly.assertThat(response.jsonPath().get("data[0].firstname").toString()).isEqualTo("Susan");
        softly.assertThat(response.jsonPath().get("data[0].lastname").toString()).isEqualTo("Jackson");
        softly.assertThat(response.jsonPath().get("data[0].totalprice").toString()).isEqualTo(322);
        softly.assertThat(response.jsonPath().get("data[1].checkin").toString()).isEqualTo("2017-08-05");
        softly.assertThat(response.jsonPath().get("data[1].checkout").toString()).isEqualTo("2019-11-03");
        softly.assertAll();

    }

}
