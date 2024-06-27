package com.wanderalvess.explorandoclima.resource;

import com.wanderalvess.explorandoclima.model.Image;
import com.wanderalvess.explorandoclima.enums.CloudCategoryEnum;
import com.wanderalvess.explorandoclima.enums.WeatherCategoryEnum;
import com.wanderalvess.explorandoclima.exception.CustomException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ImageController {
    @GetMapping(value = "/images/weather", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<List<Image>> getImagesWeather(@RequestParam("name") String category) {
        List<Image> images = new ArrayList<>();
        System.out.println(category);
        if (WeatherCategoryEnum.CLEAR_DAY.getWeatherCategory().equalsIgnoreCase(category)) {
            images.add(new Image(
                    1,
                    "clear_day",
                    "https://i.postimg.cc/MnxTWt4r/clear-day.png"));
        } else if (WeatherCategoryEnum.CLEAR_NIGHT.getWeatherCategory().equalsIgnoreCase(category)) {
            images.add(new Image(
                    2,
                    "clear_night",
                    "https://i.postimg.cc/02BwmsDc/clear-night.png"));
        } else if (WeatherCategoryEnum.CLOUD.getWeatherCategory().equalsIgnoreCase(category)) {
            images.add(new Image(
                    3,
                    "cloud",
                    "https://i.postimg.cc/FfCsVvK2/cloud.png"));
        } else if (WeatherCategoryEnum.CLOUDLY_DAY.getWeatherCategory().equalsIgnoreCase(category)) {
            images.add(new Image(
                    4,
                    "cloudly_day",
                    "https://i.postimg.cc/k6kJLyKs/cloudly-day.png"));
        } else if (WeatherCategoryEnum.CLOUDLY_NIGHT.getWeatherCategory().equalsIgnoreCase(category)) {
            images.add(new Image(
                    5,
                    "cloudly_night",
                    "https://i.postimg.cc/6276HP2T/cloudly-night.png"));
        } else if (WeatherCategoryEnum.FOG.getWeatherCategory().equalsIgnoreCase(category)) {
            images.add(new Image(
                    6,
                    "fog",
                    "https://i.postimg.cc/K4MvBdhH/fog.png"));
        } else if (WeatherCategoryEnum.RAIN.getWeatherCategory().equalsIgnoreCase(category)) {
            images.add(new Image(
                    7,
                    "rain",
                    "https://i.postimg.cc/CKjBWntQ/rain.png"));
        } else if (WeatherCategoryEnum.SNOW.getWeatherCategory().equalsIgnoreCase(category)) {
            images.add(new Image(
                    8,
                    "snow",
                    "https://i.postimg.cc/d0MZHjWC/snow.png"));
        } else if (WeatherCategoryEnum.STORM.getWeatherCategory().equalsIgnoreCase(category)) {
            images.add(new Image(
                    9,
                    "storm",
                    "https://i.postimg.cc/brFsQxDs/storm.png"));
        } else {
            throw new CustomException("Unknown category: " + category);
        }
        return ResponseEntity.ok(images);
    }

    @GetMapping(value = "/images/guide", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<List<Image>> getImagesGuide(@RequestParam("name") String category) {
        List<Image> images = new ArrayList<>();
        System.out.println(category);
        if ("guide".equalsIgnoreCase(category)) {
            images.add(new Image(1, "Guia de Identificação de Nuvens", "https://i.postimg.cc/1RDC3RW0/guia-identificacao-nuvens.jpg"));
        } else {
            throw new CustomException("Unknown category: " + category);
        }
        return ResponseEntity.ok(images);
    }

    @GetMapping(value = "/images/clouds", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
    public ResponseEntity<List<Image>> getImages(@RequestParam("category") String category) {
        List<Image> images = new ArrayList<>();
        System.out.println(category);
        if (CloudCategoryEnum.CIRRUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(1,
                    "Cirrus (Ci)",
                    "Cirrus",
                    "Nuvens finas e delicadas, muitas vezes em forma de filamentos ou penas, que se formam em altitudes elevadas. Elas são compostas principalmente de cristais de gelo.",
                    "https://i.postimg.cc/5tLdF8V8/cirrus1.jpg"));
            images.add(new Image(2,
                    "Cirrus Castellanus (Ci cas)",
                    "Cirrus Castellanus",
                    "Cirrus bastante denso na forma de pequenas torres ou massas arredondadas e fibrosas que se erguem de uma base comum, e às vezes com aparência de ameias (amias de castelo). A largura aparente das protuberâncias em forma de torre pode ser menor ou maior que 1° quando observada em um ângulo superior a 30° acima do horizonte; distinto de Cirrocumulus castellanus onde a largura é inferior a 1°",
                    "https://i.postimg.cc/W4Rxjtkz/cirrus-castellanus.jpg"));
            images.add(new Image(3,
                    "Cirrus Fibratus (Ci fib)",
                    "Cirrus Fibratus",
                    "Filamentos brancos quase retos ou mais ou menos curvados irregularmente, sempre finos e não terminando em ganchos ou tufos. Os filamentos são, em sua maioria, distintos uns dos outros.",
                    "https://i.postimg.cc/4xHjrpnj/cirrus-fibratus.jpg"));
            images.add(new Image(4,
                    "Cirrus Floccus (Ci flo)",
                    "Cirrus Floccus",
                    "Cirrus em forma de tufos pequenos, arredondados, mais ou menos isolados, muitas vezes com trilhas. A largura aparente dos tufos pode ser menor ou maior que 1° quando observados em um ângulo superior a 30° acima do horizonte; distinto de Cirrocumulus castellanus onde a largura é inferior a 1°.",
                    "https://i.postimg.cc/Zqr2qZ8c/cirrus-floccus.jpg"));
            images.add(new Image(5,
                    "Cirrus Spissatus (Ci spi)",
                    "Cirrus Spissatus",
                    "Cirrus em manchas, suficientemente densos para parecerem acinzentados quando vistos em direção ao sol; também pode velar o Sol, obscurecer o seu contorno ou mesmo ocultá-lo. Cirrus spissatus geralmente se origina da parte superior de um Cumulonimbus.",
                    "https://i.postimg.cc/1tsTnTMZ/cirrus-spissatus.jpg"));
            images.add(new Image(6,
                    "Cirrus Uncinus (Ci unc)",
                    "Cirrus Uncinus",
                    "Cirrus sem partes cinzentas, muitas vezes em forma de vírgula, terminando no topo em gancho, ou em tufo, cuja parte superior não tem forma de protuberância.",
                    "https://i.postimg.cc/kXBHbWND/cirrus-uncinus.jpg"));

        } else if (CloudCategoryEnum.STRATUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(7,
                    "Stratus (St)",
                    "Stratus",
                    "Camada de nuvens geralmente cinzenta com base bastante uniforme, podendo originar garoa, neve ou grãos de neve. Quando o Sol é visível através da nuvem, o seu contorno é claramente discernível. Stratus não produz fenômenos de halo, exceto, possivelmente, em temperaturas muito baixas.\n" +
                            "\n" +
                            "Às vezes, Stratus aparece na forma de manchas irregulares.",
                    "https://i.postimg.cc/9MLx4frG/stratus-fractus.jpg"));
            images.add(new Image(8,
                    "Stratus Fractus (St fra)",
                    "Stratus Fractus",
                    "Stratus ocorrendo na forma de fragmentos irregulares e irregulares, cujos contornos mudam continuamente e muitas vezes rapidamente..",
                    "https://i.postimg.cc/9MLx4frG/stratus-fractus.jpg"));
            images.add(new Image(9,
                    "Stratus Nebulosus (St neb)",
                    "Stratus Nebulosus",
                    "Camada nebulosa, cinzenta e bastante uniforme de Stratus. Esta é a espécie mais comum.",
                    "https://i.postimg.cc/43b2gPG2/stratus-nebulosus.jpg"));
            images.add(new Image(10,
                    "Stratus Opacus (St op)",
                    "Stratus Opacus",
                    "Remendo, folha ou camada de Stratus, cuja maior parte é tão opaca que mascara completamente o Sol ou a Lua. Esta é a variedade mais comum.",
                    "https://i.postimg.cc/y6rQskqK/stratus-opacus.jpg"));
            images.add(new Image(11,
                    "Stratus Translucidus (St tr) ",
                    "Stratus Translucidus",
                    "Remendo, folha ou camada de Stratus, cuja maior parte é suficientemente translúcida para revelar o contorno do Sol ou da Lua.",
                    "https://i.postimg.cc/BbyMgw5b/stratus-translucidus.jpg"));
            images.add(new Image(12,
                    "Stratus Undulatus (St un)",
                    "Stratus Undulatus",
                    "Stratus que exibem padrões ondulados ou estriados. Esta variedade não ocorre com muita frequência.",
                    "https://i.postimg.cc/sDQnXsyh/stratus-undulatus.jpg"));

        } else if (CloudCategoryEnum.STRATOCUMULUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(13,
                    "Stratocumulus (Sc)",
                    "Stratocumulus",
                    "Cinzento ou esbranquiçado, ou simultaneamente cinzento e esbranquiçado, mancha, lençol ou camada de nuvem quase sempre com partes escuras, composta por tesselações, massas arredondadas, rolos, etc., não fibrosas (excepto virga) e que podem ou não podem ser mesclados; a maioria dos pequenos elementos dispostos regularmente tem uma largura aparente superior a 5°.",
                    "https://i.postimg.cc/KcHzk3CY/stratocumulus.jpg"));
            images.add(new Image(14,
                    "Stratocumulus Stratiformis (Sc str)",
                    "Stratocumulus Stratiformis",
                    "Stratocumulus que cobrem o céu em camadas uniformes e contínuas. Os elementos são mais ou menos achatados. Esta espécie é a mais comum.",
                    "https://i.postimg.cc/wTRBhTdQ/stratocumulus-stratiformis.jpg"));
            images.add(new Image(15,
                    "Stratocumulus Castellanus (Sc cas)",
                    "Stratocumulus Castellanus",
                    "Stratocumulus com protuberâncias verticais semelhantes a torres ou castelos.",
                    "https://i.postimg.cc/FFwvXMYP/stratocumulus-castellanus.jpg"));
            images.add(new Image(16,
                    "Stratocumulus Lenticularis (Sc len)",
                    "Stratocumulus Lenticularis",
                    "Uma mancha de Stratocumulus, em forma de lente ou amêndoa, muitas vezes muito alongada e geralmente com contornos bem definidos. A mancha é composta por pequenos elementos (uma largura aparente superior a 5° quando observada em um ângulo superior a 30° acima do horizonte), agrupados estreitamente, ou consiste em uma unidade mais ou menos lisa e geralmente escura. A irização é possível.\n" +
                            "\n" +
                            "Esta espécie de Stratocumulus é bastante rara.",
                    "https://i.postimg.cc/CMR0thxB/stratocumulus-lenticularis.jpg"));
            images.add(new Image(17,
                    "Stratocumulus Volutus (Sc vol)",
                    "Stratocumulus Volutus",
                    "Uma massa de nuvem longa, horizontal, destacada e em forma de tubo, muitas vezes parecendo rolar lentamente em torno de um eixo horizontal. Eles geralmente ocorrem de forma singular, mas ocasionalmente são observados em linhas sucessivas de nuvens.\n" +
                            "\n" +
                            "Esta espécie de Stratocumulus é rara.",
                    "https://i.postimg.cc/XqRQ1c78/stratocumulus-volutus.jpg"));

        } else if (CloudCategoryEnum.ALTOCUMULUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(18,
                    "Altocumulus (Ac)",
                    "Altocumulus",
                    "Mancha, folha ou camada de nuvem branca ou cinzenta, ou branca e cinzenta, geralmente com sombreamento, composta por lâminas, massas arredondadas, rolos, etc., por vezes parcialmente fibrosas ou difusas e que podem ou não estar fundidas; a maioria dos pequenos elementos dispostos regularmente geralmente têm uma largura aparente entre 1° e 5°.",
                    "https://i.postimg.cc/Wz9QPnGc/altocumulus.jpg"));
            images.add(new Image(19,
                    "Altocumulus Castellanus (Ac cas)",
                    "Altocumulus Castellanus",
                    "Torres cumuliformes elevando-se verticalmente a partir de elementos de nuvem conectados por uma base horizontal comum. As torres:\n" +
                            "\n" +
                            "Parecem estar dispostos em linhas,\n" +
                            "Dê à nuvem uma aparência de ameias (ameias de castelo),\n" +
                            "Às vezes são mais altos do que largos,\n" +
                            "São especialmente evidentes quando a nuvem é vista de lado.\n" +
                            "\n" +
                            "Altocumulus castellanus é um indicador de instabilidade nesse nível; quando adquire extensão vertical considerável, é classificado como:\n" +
                            "\n" +
                            "Cumulus congestus altocumulogenitus, se brotar fortemente ou for de grande extensão vertical,\n" +
                            "Cumulonimbus altocumulogenitus, se parte de sua porção superior for lisa, fibrosa ou estriada, ou se a nuvem produzir raios, trovões ou chuvas de granizo.",
                    "https://i.postimg.cc/653kfkKW/altocumulus-castellanus.jpg"));
            images.add(new Image(20,
                    "Altocumulus Floccus (Ac flo)",
                    "Altocumulus Floccus",
                    "Pequenos tufos de aspecto cumuliforme; as partes inferiores dos tufos são geralmente irregulares e muitas vezes acompanhadas por trilhas fibrosas (cristal de gelo virga). Altocumulus floccus é uma indicação de instabilidade nesse nível. Altocumulus floccus às vezes se forma como resultado da dissipação da base do Altocumulus castellanus.",
                    "https://i.postimg.cc/hv4Hww70/altocumulus-floccus.jpg"));
            images.add(new Image(21,
                    "Altocumulus Lenticularis (Ac len)",
                    "Altocumulus Lenticularis",
                    "Uma mancha em forma de lente ou amêndoa, muitas vezes muito alongada e geralmente com contornos bem definidos. O patch pode ser composto por pequenos elementos, agrupados; ou uma unidade geralmente lisa com matizes pronunciados.",
                    "https://i.postimg.cc/bJ97m8dJ/altocumulus-lenticularis.jpg"));
            images.add(new Image(22,
                    "Altocumulus Stratiformis (Ac str)",
                    "Altocumulus Stratiformis",
                    "Uma extensa folha ou camada de elementos separados ou mesclados. Esta é de longe a espécie que ocorre com mais frequência.",
                    "https://i.postimg.cc/G3q0YcZg/altocumulus-stratiformis.jpg"));
            images.add(new Image(23,
                    "Altocumulus Translucidus",
                    "Altocumulus Translucidus",
                    "Altocumulus que são finos o suficiente para permitir a passagem da luz solar.",
                    "https://i.postimg.cc/QxyR4fNp/altocumulus-translucidus.jpg"));
            images.add(new Image(24,
                    "Altocumulus Volutus (Ac vol)",
                    "Altocumulus Volutus",
                    "Uma massa de nuvem longa, horizontal, destacada e em forma de tubo, muitas vezes parecendo rolar lentamente em torno de um eixo horizontal. Geralmente ocorre como uma linha única e raramente se estende de horizonte a horizonte.\n" +
                            "\n" +
                            "Esta espécie de Altocumulus é rara.",
                    "https://i.postimg.cc/pTvNQyW4/altocumulus-volutus.jpg"));

        } else if (CloudCategoryEnum.CUMULONIMBUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(25,
                    "Cumulonimbus (Cb)",
                    "Cumulonimbus",
                    "Nuvem pesada e densa, com considerável extensão vertical, em forma de montanha ou de enormes torres. Pelo menos parte de sua porção superior é geralmente lisa, ou fibrosa ou estriada, e quase sempre achatada; esta parte geralmente se espalha na forma de uma bigorna ou de uma vasta pluma.\n" +
                            "\n" +
                            "Sob a base desta nuvem, que é frequentemente muito escura, existem frequentemente nuvens baixas e irregulares, fundidas com ela ou não, e precipitação por vezes sob a forma de virga.",
                    "https://i.postimg.cc/Bbwwzv3q/cumulonimbus.jpg"));
            images.add(new Image(26,
                    "Cumulonimbus Calvus (Cb cal)",
                    "Cumulonimbus Calvus",
                    "Cumulonimbus onde os brotos das partes superiores são indistintos e achatados e apresentam aspecto de massa esbranquiçada sem contornos nítidos. Nenhuma parte fibrosa ou estriada é visível. Cumulonimbus calvus geralmente produz precipitação; quando chega ao solo, é em forma de chuva.",
                    "https://i.postimg.cc/HnLh3yfZ/cumulonimbus-calvus.jpg"));
            images.add(new Image(27,
                    "Cumulonimbus Capillatus (Cb cap)",
                    "Cumulonimbus Capillatus",
                    "Cumulonimbus cuja porção superior apresenta partes cirriformes de estrutura claramente fibrosa ou estriada, frequentemente em forma de bigorna (Cumulonimbus capillatus incus), de pluma ou de vasta massa desordenada de pêlos. Em massas de ar muito frias, a estrutura fibrosa muitas vezes estende-se virtualmente por toda a nuvem.\n" +
                            "\n" +
                            "Cumulonimbus capillatus é geralmente acompanhado de aguaceiro ou trovoada, muitas vezes com rajadas de vento e às vezes com granizo; freqüentemente produz virga muito distinto.",
                    "https://i.postimg.cc/c1DjCFnV/cumulonimbus-capillatus.jpg"));

        } else if (CloudCategoryEnum.NIMBOSTRATUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(28,
                    "Nimbostratus (Ns)",
                    "Nimbostratus",
                    "Camada de nuvens cinzentas, muitas vezes escuras, cuja aparência se torna difusa pela queda mais ou menos contínua de chuva ou neve, que, na maioria dos casos, atinge o solo. É espesso o suficiente para bloquear o sol.\n" +
                            "\n" +
                            "Nuvens baixas e irregulares ocorrem frequentemente abaixo da camada, com as quais podem ou não se fundir.",
                    "https://i.postimg.cc/prfm4CZc/Nimbostratus.jpg"));

        } else if (CloudCategoryEnum.CIRROSTRATUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(29,
                    "Cirrostratus (Cs)",
                    "Cirrostratus",
                    "Véu de nuvem transparente, esbranquiçado, de aspecto fibroso (semelhante a cabelo) ou liso, cobrindo total ou parcialmente o céu, muitas vezes produzindo fenômenos de halo.",
                    "https://i.postimg.cc/m25tXQ3X/Cirrostratus.jpg"));
            images.add(new Image(30,
                    "Cirrostratus duplicatus (Cs du)",
                    "Cirrostratus duplicatus",
                    "Cirrostratus dispostos em folhas ou camadas sobrepostas, em níveis ligeiramente diferentes, às vezes parcialmente mesclados.",
                    "https://i.postimg.cc/CLw72wv5/Cirrostratus-duplicatus.jpg"));
            images.add(new Image(31,
                    "Cirrostratus undulatus (Cs un)",
                    "Cirrostratus undulatus",
                    "Cirrostratus mostrando ondulações.",
                    "https://i.postimg.cc/C5sNK2Kw/Cirrostratus-undulatus.jpg"));

        } else if (CloudCategoryEnum.CIRROCUMULUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(32,
                    "Cirrocumulus (Cc)",
                    "Cirrocumulus",
                    "Mancha fina, branca, folha ou camada de nuvem sem sombreamento, composta por elementos muito pequenos em forma de grãos, ondulações, etc., mesclados ou separados, e dispostos mais ou menos regularmente; a maioria dos elementos tem uma largura aparente inferior a 1°.",
                    "https://i.postimg.cc/Lhdp9JDx/Cirrocumulus-undulatus.jpg"));
            images.add(new Image(33,
                    "Cirrocumulus lacunosus (Cc la)",
                    "Cirrocumulus lacunosus",
                    "Cirrocumulus em mancha, folha ou camada, apresentando pequenos orifícios redondos distribuídos mais ou menos regularmente, muitos deles com bordas franjadas. Elementos de nuvem e espaços claros são frequentemente organizados como uma rede ou um favo de mel.",
                    "https://i.postimg.cc/Qtts0GVJ/Cirrocumulus-lacunosus.jpg"));
            images.add(new Image(34,
                    "Cirrocumulus undulatus (Cc un)",
                    "Cirrocumulus undulatus",
                    "Cirrocumulus mostrando um ou dois sistemas de ondulações.",
                    "https://i.postimg.cc/Lhdp9JDx/Cirrocumulus-undulatus.jpg"));
            images.add(new Image(35,
                    "Cirrocumulus stratiformis (Cc str)",
                    "Cirrocumulus stratiformis",
                    "Cirrocumulo em forma de folha ou camada relativamente extensa, às vezes apresentando rupturas..",
                    "https://i.postimg.cc/DfRJJ5YM/Cirrocumulus-stratiformis.jpg"));
            images.add(new Image(35,
                    "Cirrocumulus lenticularis (Cc len)",
                    "Cirrocumulus lenticularis",
                    "Manchas de Cirrocumulus em formato de lente ou amêndoa; muitas vezes muito alongado e geralmente com contornos bem definidos. As manchas são mais ou menos isoladas, em sua maioria lisas e totalmente brancas. A irisação é às vezes observada nessas nuvens.",
                    "https://i.postimg.cc/zDyHG4ph/Cirrocumulus-lenticularis.jpg"));
            images.add(new Image(35,
                    "Cirrocumulus castellanus (Cc cas))",
                    "Cirrocumulus castellanus",
                    "Cirrocúmulos onde alguns elementos se desenvolvem verticalmente em forma de pequenos torreões, elevando-se a partir de uma base horizontal comum. A largura aparente das torres é sempre inferior a 1°, quando observadas em um ângulo superior a 30° acima do horizonte. Castellanus se desenvolve devido à instabilidade nesse nível..",
                    "https://i.postimg.cc/PJvHnWWL/Cirrocumulus-castellanus.jpg"));
            images.add(new Image(35,
                    "Cirrocumulus floccus (Cc flo)",
                    "Cirrocumulus floccus ",
                    "Tufos cumuliformes muito pequenos, cujas partes inferiores são mais ou menos irregulares. A largura aparente de cada tufo é sempre inferior a 1°, quando observado em um ângulo superior a 30° acima do horizonte. Floccus se desenvolve devido à instabilidade nesse nível. Cirrocumulus floccus às vezes evolui de Cirrocumulus castellanus, tendo a base deste último se dissipado.\n",
                    "https://i.postimg.cc/ZRMmQ7dt/Cirrocumulus-floccus.jpg"));

        } else if (CloudCategoryEnum.ALTOSTRATUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(35,
                    "Altostratus (As)",
                    "Altostratus (As)",
                    "Folha ou camada de nuvens acinzentadas ou azuladas de aparência estriada, fibrosa ou uniforme, cobrindo total ou parcialmente o céu, e com partes finas o suficiente para revelar o Sol pelo menos vagamente, como através de vidro fosco. Altostratus não apresenta fenômenos de halo.",
                    "https://i.postimg.cc/ZntsL9Yt/Altostratus.jpg"));
            images.add(new Image(36,
                    "Altostratus translucidus (As tr)",
                    "Altostratus translucidus",
                    "Altostratus, cuja maior parte é suficientemente translúcida para revelar a posição do Sol ou da Lua.",
                    "https://i.postimg.cc/1tTs4WfV/Altostratus-translucidus.jpg"));
            images.add(new Image(37,
                    "Altostratus duplicatus (As du)",
                    "Altostratus duplicatus",
                    "Altostratus composto por duas ou mais camadas sobrepostas, em níveis ligeiramente diferentes, às vezes parcialmente fundidas. Esta variedade raramente é vista em Altostratus.",
                    "https://i.postimg.cc/vmhdqfVH/Altostratus-duplicatus.jpg"));
            images.add(new Image(38,
                    "Altostratus undulatus (As un)",
                    "Altostratus undulatus",
                    "Altostratus mostrando ondulações.",
                    "https://i.postimg.cc/xTj3VG4p/Altostratus-undulatus.jpg"));
            images.add(new Image(39,
                    "Altostratus opacus (As op)",
                    "Altostratus opacus",
                    "Altostratus, cuja maior parte é suficientemente opaca para mascarar completamente o Sol ou a Lua.",
                    "https://i.postimg.cc/Hs63r7Cv/Altostratus-opacus.jpg"));
            images.add(new Image(40,
                    "Altostratus radiatus (As ra)",
                    "Altostratus radiatus",
                    "Altostratus mostrando largas faixas paralelas que parecem convergir para um ponto ou para dois pontos opostos do horizonte. Esta variedade raramente é vista em Altostratus.",
                    "https://i.postimg.cc/1zm9dnkX/Altostratus-radiatus.jpg"));

        } else if (CloudCategoryEnum.CUMULUS.getCategoryName().equalsIgnoreCase(category)) {
            images.add(new Image(41,
                    "Cumulus (Cu)",
                    "Cumulus",
                    "Nuvens destacadas, geralmente densas e de contornos nítidos, desenvolvendo-se verticalmente em forma de montes, cúpulas ou torres ascendentes, cuja parte superior saliente muitas vezes se assemelha a uma couve-flor. As partes iluminadas pelo sol dessas nuvens são em sua maioria de um branco brilhante; sua base é relativamente escura e quase horizontal. Às vezes, Cumulus é irregular.",
                    "https://i.postimg.cc/3R1qgBb0/cumulus.jpg"));
            images.add(new Image(42,
                    "Cumulus Congestus (Cu con)",
                    "Cumulus Congestus",
                    "Cúmulos fortemente brotados, com contornos geralmente nítidos e muitas vezes com grande extensão vertical. A parte superior saliente do Cumulus congestus frequentemente se assemelha a uma couve-flor. Cumulus congestus pode produzir precipitação na forma de chuva, neve ou pellets de neve. Nos trópicos, muitas vezes liberam chuvas abundantes na forma de aguaceiros.",
                    "https://i.postimg.cc/NjXPNYzc/cumulus-congestus.jpg"));
            images.add(new Image(43,
                    "Cumulus Fractus (Cu fra)",
                    "Cumulus Fractus",
                    "Cúmulos pequenos com bordas muito irregulares e com contornos em constante mudança, muitas vezes rápidas.",
                    "https://i.postimg.cc/TYF4qhQ0/cumulus-fractus.jpg"));
            images.add(new Image(44,
                    "Cumulus Humilis (Cu hum)",
                    "Cumulus Humilis",
                    "Cúmulos caracterizados por apenas uma pequena extensão vertical e geralmente parecendo achatados. Nuvens Cumulus humilis nunca produzem precipitação.",
                    "https://i.postimg.cc/HLCvRKq7/cumulus-humilis.jpg"));
            images.add(new Image(45,
                    "Cumulus Mediocris (Cu med)",
                    "Cumulus Mediocris",
                    "Cúmulus de extensão vertical moderada, com pequenas protuberâncias e brotações no topo. Cumulus mediocris geralmente não produz precipitação.",
                    "https://i.postimg.cc/5047NzN4/cumulus-mediocris.jpg"));
            images.add(new Image(46,
                    "Cumulus Radiatus (Cu ra)",
                    "Cumulus Radiatus",
                    "Cúmulus dispostos em linhas quase paralelas à direção do vento (ruas nubladas) e geralmente da espécie mediocris. Devido à perspectiva, essas linhas parecem convergir para um ponto ou para pontos opostos do horizonte.",
                    "https://i.postimg.cc/4ynWpT9j/cumulus-radiatus.jpg"));

        } else {
            throw new CustomException("Categoria desconhecida: " + category);
        }

        return ResponseEntity.ok(images);
    }
}

