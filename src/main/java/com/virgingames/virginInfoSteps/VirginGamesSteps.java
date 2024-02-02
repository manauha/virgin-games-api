package com.virgingames.virginInfoSteps;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class VirginGamesSteps {

    @Step("Getting All data of GBP currency")
    public ValidatableResponse getAllDataInGBP(){
        return SerenityRest.given().log().all()
                .queryParam(EndPoints.CURRENCY)
                .when()
                .get(EndPoints.GET_ALL_CURRENCY_NAME)
                .then();
    }
}
