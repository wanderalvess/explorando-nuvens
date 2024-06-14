package com.wanderalvess.cloudsidentificationtabback.resource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ValidationConnection {

    @GetMapping("/")
    public ResponseEntity<String> ping() {
        String htmlContent =
                "<html>" +
                        "<head>" +
                        "<meta charset=\"UTF-8\">" +
                        "<title>Informativo da API</title>" +
                        "<style>" +
                        "body { font-family: Arial, sans-serif; margin: 40px; padding: 20px; background-color: #f4f4f9; color: #333; }" +
                        "h1 { color: #1E90FF; }" +
                        "p { font-size: 16px; line-height: 1.6; }" +
                        "div.container { max-width: 800px; margin: auto; padding: 20px; background-color: #fff; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); border-radius: 8px; }" +
                        "</style>" +
                        "</head>" +
                        "<body>" +
                        "<div class='container'>" +
                        "<h1>API está rodando normalmente!</h1>" +
                        "<p>Bem-vindo ao Projeto de TCC: Explorando o clima</p>" +
                        "<p>Um projeto idealizado e realizado por Wanderson Alves Santos</p>" +
                        "</div>" +
                        "</body>" +
                        "</html>";
        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_HTML)
                .body(htmlContent);
    }
}