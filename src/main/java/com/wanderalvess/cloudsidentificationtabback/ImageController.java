package com.wanderalvess.cloudsidentificationtabback;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @GetMapping(value = "/image", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getImageWithJson() throws Exception {
        String imagePath = "C:\\Users\\wande\\Imagens\\UMADMEGO\\_MG_4532.JPG"; // substitua pelo caminho para sua imagem
        Path path = Paths.get(imagePath);
        byte[] imageBytes = Files.readAllBytes(path);
        String imageData = org.apache.commons.codec.binary.Base64.encodeBase64String(imageBytes);

        String json = String.format("{\"name\":\"teste\", \"image\":\"data:image/jpg;base64,%s\"}", imageData);
        return ResponseEntity.ok().body(json);
    }

    @GetMapping(value = "/image/raw", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<Resource> getImage() throws Exception {
        String imagePath = "C:\\Users\\wande\\Imagens\\UMADMEGO\\_MG_4532.JPG"; // substitua pelo caminho para sua imagem
        Path path = Paths.get(imagePath);
        byte[] imageBytes = Files.readAllBytes(path);
        ByteArrayResource resource = new ByteArrayResource(imageBytes);
        return ResponseEntity.ok().contentLength(imageBytes.length)
                .contentType(MediaType.IMAGE_JPEG).body(resource);
    }
}
