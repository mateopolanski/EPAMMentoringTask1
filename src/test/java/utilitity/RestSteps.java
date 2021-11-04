package utilitity;

import io.restassured.RestAssured;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilitity.Properties.baseURL;

public class RestSteps {

    protected final static String ROOT_URI = baseURL;

    public RequestSpecification given() {
        return RestAssured.given().filter(new AllureRestAssured()).baseUri(ROOT_URI).contentType(ContentType.JSON);
    }
}
