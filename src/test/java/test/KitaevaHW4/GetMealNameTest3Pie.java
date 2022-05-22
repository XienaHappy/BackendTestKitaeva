package test.KitaevaHW4;
import HW4Kitaeva.GetMealName;
import HW4Kitaeva.GetMealNameBuilder;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetMealNameTest3Pie extends AbstractTest {

    @Test
    void getPieTest() {
        given().spec(requestSpecification)
                .when()
                .queryParam("pie")
                .get("https://api.spoonacular.com/recipes/716429/information")
                .then()
                .spec(responseSpecification);
    }

    void createObject(){

        GetMealName getMealName = new GetMealNameBuilder()
                .setMealName("pie")
                .buildGetMealName();
    }
}
