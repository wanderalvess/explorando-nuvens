package com.wanderalvess.cloudsidentificationtabback;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/image")
@CrossOrigin("*")
public class ImageController {
    //spring data rest repository
    // mock
    @GetMapping(value = "/images/weather", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<List<Image>> getImagesWeather(@RequestParam("name") String name) {
        List<Image> images = new ArrayList<>();
        System.out.println(name);
        if ("clear_day".equalsIgnoreCase(name)) {
            images.add(new Image(1, "clear_day", "https://i.postimg.cc/MnxTWt4r/clear-day.png"));
        } else if ("clear_night".equalsIgnoreCase(name)) {
            images.add(new Image(1, "clear_night", "https://i.postimg.cc/02BwmsDc/clear-night.png"));
        } else if ("cloud".equalsIgnoreCase(name)) {
            images.add(new Image(1, "cloud", "https://i.postimg.cc/FfCsVvK2/cloud.png"));
        } else if ("cloudly_day".equalsIgnoreCase(name)) {
            images.add(new Image(1, "cloudly_day", "https://i.postimg.cc/k6kJLyKs/cloudly-day.png"));
        } else if ("cloudly_night".equalsIgnoreCase(name)) {
            images.add(new Image(1, "cloudly_night", "https://i.postimg.cc/6276HP2T/cloudly-night.png"));
        } else if ("fog".equalsIgnoreCase(name)) {
            images.add(new Image(1, "fog", "https://i.postimg.cc/K4MvBdhH/fog.png"));
        } else if ("rain".equalsIgnoreCase(name)) {
            images.add(new Image(1, "rain", "https://i.postimg.cc/CKjBWntQ/rain.png"));
        } else if ("snow".equalsIgnoreCase(name)) {
            images.add(new Image(1, "snow", "https://i.postimg.cc/d0MZHjWC/snow.png"));
        } else if ("storm".equalsIgnoreCase(name)) {
            images.add(new Image(1, "storm", "https://i.postimg.cc/brFsQxDs/storm.png"));

        } else {

        }
        return ResponseEntity.ok(images);
    }

    @GetMapping(value = "/images/guide", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<List<Image>> getImagesGuide(@RequestParam("name") String name) {
        List<Image> images = new ArrayList<>();
        System.out.println(name);
        if ("guide".equalsIgnoreCase(name)) {
            images.add(new Image(1, "Guia de Identificação de Nuvens", "https://i.postimg.cc/1RDC3RW0/guia-identificacao-nuvens.jpg"));
        } else {

        }
        return ResponseEntity.ok(images);
    }

    @GetMapping(value = "/images", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<List<Image>> getImages(@RequestParam("category") String category) {
        List<Image> images = new ArrayList<>();
        System.out.println(category);
        if ("Cirrus".equalsIgnoreCase(category)) {
            images.add(new Image(1,
                    "Cirrus (Ci)",
                    "Nuvens finas e delicadas, muitas vezes em forma de filamentos ou penas, que se formam em altitudes elevadas. Elas são compostas principalmente de cristais de gelo.",
                    "https://i.postimg.cc/5tLdF8V8/cirrus1.jpg"));
            images.add(new Image(2,
                    "Cirrus Castellanus (Ci cas)",
                    "Cirrus bastante denso na forma de pequenas torres ou massas arredondadas e fibrosas que se erguem de uma base comum, e às vezes com aparência de ameias (amias de castelo). A largura aparente das protuberâncias em forma de torre pode ser menor ou maior que 1° quando observada em um ângulo superior a 30° acima do horizonte; distinto de Cirrocumulus castellanus onde a largura é inferior a 1°",
                    "https://i.postimg.cc/W4Rxjtkz/cirrus-castellanus.jpg"));
            images.add(new Image(3,
                    "Cirrus Fibratus (Ci fib)",
                    "Filamentos brancos quase retos ou mais ou menos curvados irregularmente, sempre finos e não terminando em ganchos ou tufos. Os filamentos são, em sua maioria, distintos uns dos outros.",
                    "https://i.postimg.cc/4xHjrpnj/cirrus-fibratus.jpg"));
            images.add(new Image(4,
                    "Cirrus Floccus (Ci flo)",
                    "Cirrus em forma de tufos pequenos, arredondados, mais ou menos isolados, muitas vezes com trilhas. A largura aparente dos tufos pode ser menor ou maior que 1° quando observados em um ângulo superior a 30° acima do horizonte; distinto de Cirrocumulus castellanus onde a largura é inferior a 1°.",
                    "https://i.postimg.cc/Zqr2qZ8c/cirrus-floccus.jpg"));
            images.add(new Image(5,
                    "Cirrus Spissatus (Ci spi)",
                    "Cirrus em manchas, suficientemente densos para parecerem acinzentados quando vistos em direção ao sol; também pode velar o Sol, obscurecer o seu contorno ou mesmo ocultá-lo. Cirrus spissatus geralmente se origina da parte superior de um Cumulonimbus.",
                    "https://i.postimg.cc/1tsTnTMZ/cirrus-spissatus.jpg"));
            images.add(new Image(6,
                    "Cirrus Uncinus (Ci unc)",
                    "Cirrus sem partes cinzentas, muitas vezes em forma de vírgula, terminando no topo em gancho, ou em tufo, cuja parte superior não tem forma de protuberância.",
                    "https://i.postimg.cc/kXBHbWND/cirrus-uncinus.jpg"));

        } else if ("Cumulus".equalsIgnoreCase(category)) {
            images.add(new Image(1, "Cumulus", "Nuvens brancas e fofas com bases planas e topos arredondados, encontradas em altitudes médias.", "https://i.postimg.cc/3R1qgBb0/cumulus.jpg"));
            images.add(new Image(1, "Cumulus Congestus", "Cumulus que se desenvolvem verticalmente em grandes torres, indicando instabilidade atmosférica.", "https://i.postimg.cc/NjXPNYzc/cumulus-congestus.jpg"));
            images.add(new Image(1, "Cumulus Fractus", "Cumulus quebrados ou fragmentados, muitas vezes associados a tempo instável.", "https://i.postimg.cc/TYF4qhQ0/cumulus-fractus.jpg"));
            images.add(new Image(1, "Cumulus Humilis", "Cumulus de pequena estatura, indicativos de tempo calmo e estável.", "https://i.postimg.cc/HLCvRKq7/cumulus-humilis.jpg"));
            images.add(new Image(1, "Cumulus Mediocris", "Cumulus de altura média, entre o humilis e o congestus.", "https://i.postimg.cc/5047NzN4/cumulus-mediocris.jpg"));
            images.add(new Image(1, "Cumulus Radiatus", "Cumulus com bases paralelas, criando uma aparência de \"rugas\" no céu.", "https://i.postimg.cc/4ynWpT9j/cumulus-radiatus.jpg"));

        } else if ("Stratus".equalsIgnoreCase(category)) {
            images.add(new Image(7, "Stratus",
                    "Nuvens baixas, cinzentas e uniformes, que cobrem o céu como um véu. Elas geralmente estão associadas a tempo chuvoso ou nebuloso.",
                    "https://i.postimg.cc/9MLx4frG/stratus-fractus.jpg"));
            images.add(new Image(8, "Stratus Fractus",
                    "Stratus quebrados ou fragmentados, muitas vezes formando camadas irregulares.",
                    "https://i.postimg.cc/9MLx4frG/stratus-fractus.jpg"));
            images.add(new Image(9, "Stratus Nebulosus",
                    "NStratus que são espessos e opacos, com pouca definição de contornos.",
                    "https://i.postimg.cc/43b2gPG2/stratus-nebulosus.jpg"));
            images.add(new Image(10, "Stratus Opacus",
                    "Stratus que são densos o suficiente para bloquear a luz do sol, criando um céu sombrio e nublado.",
                    "https://i.postimg.cc/y6rQskqK/stratus-opacus.jpg"));
            images.add(new Image(11, "Stratus Translucidus",
                    "Stratus que são finos o suficiente para permitir a passagem da luz solar, criando uma aparência difusa.",
                    "https://i.postimg.cc/BbyMgw5b/stratus-translucidus.jpg"));
            images.add(new Image(12, "Stratus Undulatus",
                    "Stratus que exibem padrões ondulados ou estriados.",
                    "https://i.postimg.cc/sDQnXsyh/stratus-undulatus.jpg"));

        } else if ("Stratocumulus".equalsIgnoreCase(category)) {
            images.add(new Image(13, "Stratocumulus",
                    "Nuvens baixas, estendidas e onduladas, que muitas vezes formam camadas contínuas.",
                    "https://i.postimg.cc/KcHzk3CY/stratocumulus.jpg"));
            images.add(new Image(14, "Stratocumulus Stratiformis",
                    "Stratocumulus que cobrem o céu em camadas uniformes e contínuas",
                    "https://i.postimg.cc/wTRBhTdQ/stratocumulus-stratiformis.jpg"));
            images.add(new Image(15, "Stratocumulus Castellanus",
                    "Stratocumulus com protuberâncias verticais semelhantes a torres ou castelos.",
                    "https://i.postimg.cc/FFwvXMYP/stratocumulus-castellanus.jpg"));
            images.add(new Image(16, "Stratocumulus Lenticularis",
                    "Stratocumulus que assumem uma forma de lente, muitas vezes encontradas em altitudes mais elevadas.",
                    "https://i.postimg.cc/CMR0thxB/stratocumulus-lenticularis.jpg"));
            images.add(new Image(17, "Stratocumulus Volutus",
                    "Stratocumulus que exibem padrões espirais ou giratórios.",
                    "https://i.postimg.cc/XqRQ1c78/stratocumulus-volutus.jpg"));

        } else if ("Altocumulus".equalsIgnoreCase(category)) {
            images.add(new Image(18, "Altocumulus",
                    "Nuvens médias e altas, geralmente em camadas finas ou pequenos grupos",
                    "https://i.postimg.cc/Wz9QPnGc/altocumulus.jpg"));
            images.add(new Image(19, "Altocumulus Castellanus",
                    "Altocumulus com protuberâncias verticais semelhantes a torres ou castelos.",
                    "https://i.postimg.cc/653kfkKW/altocumulus-castellanus.jpg"));
            images.add(new Image(20, "Altocumulus Floccus",
                    "Altocumulus com extremidades fragmentadas ou em penugem.",
                    "https://i.postimg.cc/hv4Hww70/altocumulus-floccus.jpg"));
            images.add(new Image(21, "Altocumulus Lenticularis",
                    "Altocumulus que assumem uma forma de lente, frequentemente encontradas em altitudes médias.",
                    "https://i.postimg.cc/bJ97m8dJ/altocumulus-lenticularis.jpg"));
            images.add(new Image(22, "Altocumulus Stratiformis",
                    "Altocumulus que cobrem o céu em camadas uniformes e contínuas.",
                    "https://i.postimg.cc/G3q0YcZg/altocumulus-stratiformis.jpg"));
            images.add(new Image(23, "Altocumulus Translucidus",
                    "Altocumulus que são finos o suficiente para permitir a passagem da luz solar.",
                    "https://i.postimg.cc/QxyR4fNp/altocumulus-translucidus.jpg"));
            images.add(new Image(24, "Altocumulus Volutus",
                    "Altocumulus que exibem padrões espirais ou giratórios.",
                    "https://i.postimg.cc/pTvNQyW4/altocumulus-volutus.jpg"));

        } else if ("Cumulonimbus".equalsIgnoreCase(category)) {
            images.add(new Image(25, "Cumulonimbus",
                    "Nuvens densas e verticais, muitas vezes associadas a tempestades severas, trovões e chuvas intensas.",
                    "https://i.postimg.cc/Bbwwzv3q/cumulonimbus.jpg"));
            images.add(new Image(26, "Cumulonimbus Calvus",
                    "Cumulonimbus sem uma cobertura de bigorna, indicando um estágio inicial de desenvolvimento.",
                    "https://i.postimg.cc/HnLh3yfZ/cumulonimbus-calvus.jpg"));
            images.add(new Image(27, "Cumulonimbus Capillatus",
                    "Cumulonimbus com uma bigorna distinta no topo, indicando um estágio mais avançado de desenvolvimento.",
                    "https://i.postimg.cc/c1DjCFnV/cumulonimbus-capillatus.jpg"));
        } else {
            // Lógica para tratar categorias desconhecidas ou erro
            // Neste exemplo, estou retornando uma lista vazia para categorias desconhecidas.
        }

        return ResponseEntity.ok(images);
    }
}

