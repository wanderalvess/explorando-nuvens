package com.wanderalvess.explorandoclima.resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/api")
public class WeatherController {

    @GetMapping("/weather")
    public ResponseEntity<String> getWeather(@RequestParam String city) {
        String apiKey = "14193a96";
        String apiUrl = String.format("https://api.hgbrasil.com/weather?format=json-cors&key=%s&city_name=%s", apiKey, city);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null, String.class);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", java.nio.charset.StandardCharsets.UTF_8));

        return ResponseEntity.ok()
                .headers(headers)
                .body(response.getBody());
    }
}
