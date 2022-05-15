package KitaevaPostCuisine;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class ChineseCuisineTest {

    private final String apiKey = "31db9b7011e14c63a1645083058e2bf8";

    @Test
    void postCuisineTest() {
        given()
                .queryParam("apiKey", apiKey)
                .queryParam("chinese")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(5000L))
                .statusLine("HTTP/1.1 200 OK");
    }
}
