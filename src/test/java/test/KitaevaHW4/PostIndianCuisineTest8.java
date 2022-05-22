package test.KitaevaHW4;

import HW4Kitaeva.GetMealName;
import HW4Kitaeva.GetMealNameBuilder;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostIndianCuisineTest8 extends AbstractTest {

    @Test
    void postChineseCuisineTest() {
        given().spec(requestSpecification)
                .when()
                .queryParam("indian")
                .post("https://api.spoonacular.com/recipes/cuisine")
                .then()
                .spec(responseSpecification);
    }

    void createObject(){

        GetMealName getMealName = new GetMealNameBuilder()
                .setMealName("indian")
                .buildGetMealName();
    }
}

