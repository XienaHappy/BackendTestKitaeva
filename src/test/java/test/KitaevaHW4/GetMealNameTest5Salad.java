package test.KitaevaHW4;
import HW4Kitaeva.GetMealName;
import HW4Kitaeva.GetMealNameBuilder;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetMealNameTest5Salad extends AbstractTest {

    @Test
    void getSaladTest() {
        given().spec(requestSpecification)
                .when()
                .queryParam("salad")
                .get("https://api.spoonacular.com/recipes/716429/information")
                .then()
                .spec(responseSpecification);
    }

    void createObject(){

        GetMealName getMealName = new GetMealNameBuilder()
                .setMealName("salad")
                .buildGetMealName();
    }
}
