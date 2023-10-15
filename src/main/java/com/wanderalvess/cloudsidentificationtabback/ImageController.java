package com.wanderalvess.cloudsidentificationtabback;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ImageController {

    @GetMapping(value = "/image", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getImageWithJson() throws Exception {
        String imagePath = "C:\\Users\\wande\\Projetos\\clouds-identification-tab-back\\nuvem.JPG"; // substitua pelo caminho para sua imagem
        Path path = Paths.get(imagePath);
        byte[] imageBytes = Files.readAllBytes(path);
        String imageData = org.apache.commons.codec.binary.Base64.encodeBase64String(imageBytes);

        String json = String.format("{\"name\":\"teste\", \"image\":\"data:image/jpg;base64,%s\"}", imageData);
        return ResponseEntity.ok().body(json);
    }

    @GetMapping(value = "/image/raw", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<Resource> getImage(@RequestParam("category") String category) throws Exception {
        String imagePath;

        if ("cirrus".equalsIgnoreCase(category)) {
            imagePath = "C:\\Users\\wande\\Projetos\\clouds-identification-tab-back\\cirrus.JPG";
        } else if ("cumulus".equalsIgnoreCase(category)) {
            imagePath = "C:\\Users\\wande\\Projetos\\clouds-identification-tab-back\\cumulus.JPG";
        } else {
            // Lógica para tratar categorias desconhecidas ou erro
            // Você pode lançar uma exceção, retornar uma imagem padrão, ou tratar de outra forma adequada ao seu aplicativo.
            // Neste exemplo, estou retornando uma imagem padrão.
            imagePath = "Caminho para uma imagem padrão";
        }

        Path path = Paths.get(imagePath);
        byte[] imageBytes = Files.readAllBytes(path);
        ByteArrayResource resource = new ByteArrayResource(imageBytes);
        return ResponseEntity.ok()
                .contentLength(imageBytes.length)
                .contentType(MediaType.IMAGE_JPEG)
                .body(resource);
    }


    @GetMapping(value = "/images", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Image>> getImages(@RequestParam("category") String category) {
        List<Image> images = new ArrayList<>();
        System.out.println(category);
        if ("Nuvens Cirrus".equalsIgnoreCase(category)) {
            images.add(new Image("cirrus1", "https://i.postimg.cc/C54KNSmC/MG-3831.jpg"));
            images.add(new Image("cirrus2", "https://i.postimg.cc/VNP3YnY6/MG-3829.jpg"));
            images.add(new Image("cirrus3", "https://i.postimg.cc/4yvrH3BG/MG-4210.jpg"));
            images.add(new Image("cirrus4", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("cirrus1", "https://i.postimg.cc/C54KNSmC/MG-3831.jpg"));
            images.add(new Image("cirrus2", "https://i.postimg.cc/VNP3YnY6/MG-3829.jpg"));
            images.add(new Image("cirrus3", "https://i.postimg.cc/4yvrH3BG/MG-4210.jpg"));
            images.add(new Image("cirrus4", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));

        } else if ("Nuvens Cumulus".equalsIgnoreCase(category)) {
            images.add(new Image("cumulus1", "https://i.postimg.cc/VNP3YnY6/MG-3829.jpg"));
            images.add(new Image("cumulus2", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("cumulus3", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("cumulus4", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("cumulus1", "https://i.postimg.cc/VNP3YnY6/MG-3829.jpg"));
            images.add(new Image("cumulus2", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("cumulus3", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("cumulus4", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
        } else if ("Nuvens Stratus".equalsIgnoreCase(category)) {
            images.add(new Image("stratus1", "https://i.postimg.cc/VNP3YnY6/MG-3829.jpg"));
            images.add(new Image("stratus2", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("stratus3", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("stratus4", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("stratus1", "https://i.postimg.cc/VNP3YnY6/MG-3829.jpg"));
            images.add(new Image("stratus2", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("stratus3", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image("stratus4", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
        } else {
            // Lógica para tratar categorias desconhecidas ou erro
            // Neste exemplo, estou retornando uma lista vazia para categorias desconhecidas.
        }

        return ResponseEntity.ok(images);
    }
}

