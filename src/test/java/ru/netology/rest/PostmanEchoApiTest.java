package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoApiTest {
    @Test
    void shouldReturnDemoBodyFromPostmanEcho() {
        given()
            .baseUri("https://postman-echo.com")
            .contentType("text/plain; charset=UTF-8")
            .body("Some Body Data 1")
            .when()
            .post("/post")
            .then()
            .statusCode(200)
            .body("data", equalTo("Some Body Data"));
    }
}
