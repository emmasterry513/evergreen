package com.evergreen.evergreen.controller;

import com.evergreen.evergreen.model.Plant;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
 public class EvergreenControllerTests {

     @LocalServerPort
     private int port;
     TestRestTemplate restTemplate = new TestRestTemplate();
     HttpHeaders headers = new HttpHeaders();


     @Test
     public void retrievePlantByIdReturnsValidPlanInformation() throws JSONException {
         HttpEntity<String> entity = new HttpEntity<String>(null, headers);
         ResponseEntity<String> response = restTemplate.exchange(
                 createURLWithPort("/plant/1"), HttpMethod.GET, entity, String.class);
         String expected  = "{\"id\":1,\"name\":\"Little Bamboo\",\"size\":12,\"age\":3,\"alive\":true}";
         JSONAssert.assertEquals(expected, response.getBody(), false);
     }

     private String createURLWithPort(String uri) {
         return "http://localhost:" + port + uri;
     }

 }
