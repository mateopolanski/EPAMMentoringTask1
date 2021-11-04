package utilitity;

import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;

public class BaseTests {
    protected SoftAssertions softly = new SoftAssertions();
    protected RestController calls = new RestController();
    protected Response response;
}
