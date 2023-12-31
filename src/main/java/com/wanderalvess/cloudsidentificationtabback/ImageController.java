package com.wanderalvess.cloudsidentificationtabback;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/image")
@CrossOrigin("*")
public class ImageController {
     //spring data rest repository
    // mock
    @GetMapping(value = "/images", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Image>> getImages(@RequestParam("category") String category) {
        List<Image> images = new ArrayList<>();
        System.out.println(category);
        if ("Cirrus".equalsIgnoreCase(category)) {
            images.add(new Image(1, "Cirrus", "Nuvem Cirrus", "https://i.postimg.cc/5tLdF8V8/cirrus1.jpg"));
            images.add(new Image(1, "Cirrus Castellanus", "Nuvem Cirrus Castellanus", "https://i.postimg.cc/W4Rxjtkz/cirrus-castellanus.jpg"));
            images.add(new Image(1, "Cirrus Fibratus", "Nuvem Cirrus Fibratus", "https://i.postimg.cc/4xHjrpnj/cirrus-fibratus.jpg"));
            images.add(new Image(1, "Cirrus Floccus", "Nuvem Cirrus Floccus", "https://i.postimg.cc/Zqr2qZ8c/cirrus-floccus.jpg"));
            images.add(new Image(1, "Cirrus Spissatus", "Nuvem Cirrus Spissatus", "https://i.postimg.cc/1tsTnTMZ/cirrus-spissatus.jpg"));
            images.add(new Image(1, "Cirrus Uncinus", "Nuvem Cirrus Uncinus", "https://i.postimg.cc/kXBHbWND/cirrus-uncinus.jpg"));

        } else if ("Cumulus".equalsIgnoreCase(category)) {
            images.add(new Image(1, "Cumulus", "Nuvem Cumulus", "https://i.postimg.cc/3R1qgBb0/cumulus.jpg"));
            images.add(new Image(1, "Cumulus Congestus", "Nuvem Cumulus Congestus", "https://i.postimg.cc/NjXPNYzc/cumulus-congestus.jpg"));
            images.add(new Image(1, "Cumulus Fractus", "Nuvem Cumulus Fractus", "https://i.postimg.cc/TYF4qhQ0/cumulus-fractus.jpg"));
            images.add(new Image(1, "Cumulus Humilis", "Nuvem Cumulus Humilis", "https://i.postimg.cc/HLCvRKq7/cumulus-humilis.jpg"));
            images.add(new Image(1, "Cumulus Mediocris", "Nuvem Cumulus Mediocris", "https://i.postimg.cc/5047NzN4/cumulus-mediocris.jpg"));
            images.add(new Image(1, "Cumulus Radiatus", "Nuvem Cumulus Radiatus", "https://i.postimg.cc/4ynWpT9j/cumulus-radiatus.jpg"));

        } else if ("Stratus".equalsIgnoreCase(category)) {
            images.add(new Image(1, "Stratus Fractus", "Nuvem Stratus Fractus", "https://i.postimg.cc/9MLx4frG/stratus-fractus.jpg"));
            images.add(new Image(1, "Stratus Nebulosus", "Nuvem Stratus Nebulosus", "https://i.postimg.cc/43b2gPG2/stratus-nebulosus.jpg"));
            images.add(new Image(1, "Stratus Opacus", "Nuvem Stratus Opacus", "https://i.postimg.cc/y6rQskqK/stratus-opacus.jpg"));
            images.add(new Image(1, "Stratus Translucidus", "Nuvem Stratus Translucidus", "https://i.postimg.cc/BbyMgw5b/stratus-translucidus.jpg"));
            images.add(new Image(1, "Stratus Undulatus", "Nuvem Stratus Undulatus", "https://i.postimg.cc/sDQnXsyh/stratus-undulatus.jpg"));

        } else if ("Stratocumulus".equalsIgnoreCase(category)) {
            images.add(new Image(1, "Stratocumulus", "Nuvem Stratocumulus", "https://i.postimg.cc/KcHzk3CY/stratocumulus.jpg"));
            images.add(new Image(1, "Stratocumulus Stratiformis", "Nuvem Stratus Stratiformis", "https://i.postimg.cc/wTRBhTdQ/stratocumulus-stratiformis.jpg"));
            images.add(new Image(1, "Stratocumulus Castellanus", "Nuvem Stratus Castellanus", "https://i.postimg.cc/FFwvXMYP/stratocumulus-castellanus.jpg"));
            images.add(new Image(1, "Stratocumulus Lenticularis", "Nuvem Stratus Lenticularis", "https://i.postimg.cc/CMR0thxB/stratocumulus-lenticularis.jpg"));
            images.add(new Image(1, "Stratocumulus Volutus", "Nuvem Stratus Volutus", "https://i.postimg.cc/XqRQ1c78/stratocumulus-volutus.jpg"));

        } else if ("Altocumulus".equalsIgnoreCase(category)){
            images.add(new Image(1, "Altocumulus", "Nuvem Altocumulus", "https://i.postimg.cc/Wz9QPnGc/altocumulus.jpg"));
            images.add(new Image(1, "Altocumulus Castellanus", "Nuvem Altocumulus Castellanus", "https://i.postimg.cc/653kfkKW/altocumulus-castellanus.jpg"));
            images.add(new Image(1, "Altocumulus Floccus", "Nuvem Altocumulus Floccus", "https://i.postimg.cc/hv4Hww70/altocumulus-floccus.jpg"));
            images.add(new Image(1, "Altocumulus Lenticularis", "Nuvem Altocumulus Lenticularis", "https://i.postimg.cc/bJ97m8dJ/altocumulus-lenticularis.jpg"));
            images.add(new Image(1, "Altocumulus Stratiformis", "Nuvem Altocumulus Stratiformis", "https://i.postimg.cc/G3q0YcZg/altocumulus-stratiformis.jpg"));
            images.add(new Image(1, "Altocumulus Translucidus", "Nuvem Altocumulus Translucidus", "https://i.postimg.cc/QxyR4fNp/altocumulus-translucidus.jpg"));
            images.add(new Image(1, "Altocumulus Volutus", "Nuvem Altocumulus Volutus", "https://i.postimg.cc/pTvNQyW4/altocumulus-volutus.jpg"));

        }  else if ("Cumulonimbus".equalsIgnoreCase(category)) {
            images.add(new Image(1, "Cumulonimbus", "Nuvem Cumulonimbus", "https://i.postimg.cc/Bbwwzv3q/cumulonimbus.jpg"));
            images.add(new Image(1, "Cumulonimbus Calvus", "Nuvem Cumulonimbus Calvus", "https://i.postimg.cc/HnLh3yfZ/cumulonimbus-calvus.jpg"));
            images.add(new Image(1, "Cumulonimbus Capillatus", "Nuvem Cumulonimbus Capillatus", "https://i.postimg.cc/c1DjCFnV/cumulonimbus-capillatus.jpg"));
        } else {
            // Lógica para tratar categorias desconhecidas ou erro
            // Neste exemplo, estou retornando uma lista vazia para categorias desconhecidas.
        }

        return ResponseEntity.ok(images);
    }
}

