package com.virgingames.virgingamesinfo;

import com.virgingames.testbase.TestBase;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.annotations.WithTags;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class TagsTest extends TestBase {


    @WithTag("VirginGamesFeature:NEGATIVE")
    @Title("400 status code for incorrect HTTP method to access resource")
    @Test
    public void invalidMethod() {
        SerenityRest.given()
                .when()
                .post("/bingo")
                .then()
                .statusCode(400)
                .log().all();
    }

    @WithTags({
            @WithTag("VirginGamesFeature:POSITIVE"),
            @WithTag("VirginGamesFeature:SMOKE"),
    })
    @Title("Status code of 200 is returned for GET request")
    @Test
    public void verifyIfStatusCodeIs200() {
        SerenityRest.given()
                .when()
                .get("/bingo")
                .then()
                .statusCode(200)
                .log().all();
    }


    @WithTags({
            @WithTag("VirginGamesFeature:NEGATIVE"),
            @WithTag("VirginGamesFeature:SMOKE"),
    })
    @Title("Status code 400 when user tries to access an invalid resource")
    @Test
    public void inCorrectResource() {
        SerenityRest.given()
                .when()
                .get("/bingo123")
                .then()
                .statusCode(400)
                .log().all();
    }
}

