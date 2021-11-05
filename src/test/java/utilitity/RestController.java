package utilitity;

import io.restassured.response.Response;
import model.PostRequest;
import utilitity.RestSteps;
import static io.restassured.RestAssured.given;

public class RestController  {
    public Response post(PostRequest body) {
        return
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
        return
                .given()
                .when()
                .basePath("/9")
                .log().all()
                .get()
                .then()
                .log().all()
                .extract().response();
    }


}
