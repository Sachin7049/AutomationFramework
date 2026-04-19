package API_TESTING;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SimpleAPITest {

    public static void main(String[] args) {

        // Base URI

       ;

        // 🔹 Always print full response first (DEBUG RULE)
        System.out.println("Full Response:");
        System.out.println(response.asString());

        // Status validation
        System.out.println("Status Code: " + response.getStatusCode());


    }
}
