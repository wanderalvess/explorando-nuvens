package com.wanderalvess.cloudsidentificationtabback;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/image")
@CrossOrigin("*")
public class ImageController {

//    //tentativa 1
//    @GetMapping(value = "/image", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> getImageWithJson() throws Exception {
//        String imagePath = "C:\\Users\\wande\\Projetos\\clouds-identification-tab-back\\nuvem.JPG"; // substitua pelo caminho para sua imagem
//        Path path = Paths.get(imagePath);
//        byte[] imageBytes = Files.readAllBytes(path);
//        String imageData = org.apache.commons.codec.binary.Base64.encodeBase64String(imageBytes);
//
//        String json = String.format("{\"name\":\"teste\", \"image\":\"data:image/jpg;base64,%s\"}", imageData);
//        return ResponseEntity.ok().body(json);
//    }
//
//    //tentativa 2
//
//    @GetMapping(value = "/image/raw", produces = MediaType.IMAGE_JPEG_VALUE)
//    public ResponseEntity<Resource> getImage(@RequestParam("category") String category) throws Exception {
//        String imagePath;
//
//        if ("cirrus".equalsIgnoreCase(category)) {
//            imagePath = "C:\\Users\\wande\\Projetos\\clouds-identification-tab-back\\cirrus.JPG";
//        } else if ("cumulus".equalsIgnoreCase(category)) {
//            imagePath = "C:\\Users\\wande\\Projetos\\clouds-identification-tab-back\\cumulus.JPG";
//        } else {
//            // Lógica para tratar categorias desconhecidas ou erro
//            // Você pode lançar uma exceção, retornar uma imagem padrão, ou tratar de outra forma adequada ao seu aplicativo.
//            // Neste exemplo, estou retornando uma imagem padrão.
//            imagePath = "Caminho para uma imagem padrão";
//        }
//
//        Path path = Paths.get(imagePath);
//        byte[] imageBytes = Files.readAllBytes(path);
//        ByteArrayResource resource = new ByteArrayResource(imageBytes);
//        return ResponseEntity.ok()
//                .contentLength(imageBytes.length)
//                .contentType(MediaType.IMAGE_JPEG)
//                .body(resource);
//    }

    //tentativa 3

    @GetMapping(value = "/images", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Image>> getImages(@RequestParam("category") String category) {
        List<Image> images = new ArrayList<>();
        System.out.println(category);
        if ("Nuvens Cirrus".equalsIgnoreCase(category)) {
            images.add(new Image(1,"cirrus","Nuvem Cirrus", "https://i.postimg.cc/C54KNSmC/MG-3831.jpg"));
            images.add(new Image(3,"cirrus","Nuvem Cirrus", "https://i.postimg.cc/VNP3YnY6/MG-3829.jpg"));
            images.add(new Image(4,"cirrus","Nuvem Cirrus", "https://i.postimg.cc/4yvrH3BG/MG-4210.jpg"));
            images.add(new Image(5,"cirrus","Nuvem Cirrus", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));

        } else if ("Nuvens Cumulus".equalsIgnoreCase(category)) {
            images.add(new Image(1,"cumulus","Nuvem cumulus", "https://i.postimg.cc/VNP3YnY6/MG-3829.jpg"));
            images.add(new Image(3,"cumulus","Nuvem cumulus", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image(4,"cumulus","Nuvem cumulus", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image(5,"cumulus","Nuvem cumulus", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));

        } else if ("Nuvens Stratus".equalsIgnoreCase(category)) {
            images.add(new Image(1,"stratusasdasd","Nuvem stratus", "https://i.postimg.cc/VNP3YnY6/MG-3829.jpg"));
            images.add(new Image(2,"stratusfjfghjfghj","Nuvem stratus", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image(3,"stratusdfsdf","Nuvem stratus", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
            images.add(new Image(4,"stratustryrty","Nuvem stratus", "https://i.postimg.cc/Vk2D18WW/MG-4226.jpg"));
        } else {
            // Lógica para tratar categorias desconhecidas ou erro
            // Neste exemplo, estou retornando uma lista vazia para categorias desconhecidas.
        }

        return ResponseEntity.ok(images);
    }
}

