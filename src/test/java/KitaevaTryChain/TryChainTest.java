package KitaevaTryChain;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TryChainTest {
    String id;

    @Test
    void tryChainTest() {
        id = given()
                .queryParam("hash", "a3da66460bfb7e62ea1c96cfa0b7a634a346ccbf")
                .queryParam("apiKey", "3e6cc9c807c84d0ba3518045b86e6687")
                .body("{\n"
                        + " \"date\": 1644881179,\n"
                        + " \"slot\": 2,\n"
                        + " \"position\": 8,\n"
                        + " \"type\": \"INGREDIENTS\",\n"
                        + " \"value\": {\n"
                        + " \"ingredients\": [\n"
                        + " {\n"
                        + " \"name\": \"tomato\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/mealplanner/geekbrains/items")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id")
                .toString();
    }

    void tearDown() {
        given()
                .queryParam("hash", "a3da66460bfb7e62ea1c96cfa0b7a634a346ccbf")
                .queryParam("apiKey", "3e6cc9c807c84d0ba3518045b86e6687")
                .delete("https://api.spoonacular.com/mealplanner/geekbrains/items/" + id)
                .then()
                .statusCode(200);
    }
}

