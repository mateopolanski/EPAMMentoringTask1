package utilitity;

import io.restassured.response.Response;
import model.PostRequest;
import io.restassured.RestAssured;
import utilitity.RestSteps;

public class RestController  {
    public Response post(PostRequest body) {
        return super
                .given()
                .body(body)
                .basePath("")
                .log().all()
                .post()
                .then()
                .log().all()
                .extract()
                .response();
    }

    public Response get() {
        return super
                .given()
                .when()
                .basePath("/id")
                .log().all()
                .get()
                .then()
                .log().all()
                .extract().response();
    }


}
