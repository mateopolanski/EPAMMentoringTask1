package utilitity;

import io.restassured.response.Response;
import model.PostRequest;
import utilitity.RestSteps;
import static io.restassured.RestAssured.given;

public class RestController extends RestSteps {
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
                .basePath("/9")
                .log().all()
                .get()
                .then()
                .log().all()
                .extract().response();
    }


}
