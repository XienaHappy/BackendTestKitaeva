package KitaevaGetComplexSearch;


import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class Test1Burger {

    private final String apiKey = "31db9b7011e14c63a1645083058e2bf8";

    @Test
    void getBurgerTest() {
        given()
                .queryParam("apiKey", apiKey)
                .queryParam("burger")
                .when()
                .get("https://api.spoonacular.com/recipes/716429/information")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(5000L))
                .statusLine("HTTP/1.1 200 OK");
    }
}
