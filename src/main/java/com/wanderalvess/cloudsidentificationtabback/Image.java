package com.wanderalvess.cloudsidentificationtabback;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

//@Entity
//@Table(name = "imagens")
public class Image {
    //@Id
    //@Column(name = "id")
    private Integer id;
    //@Column(name = "titulo")
    private String nameCloudType;
    //@Column(name = "descricao")
    private String descriptionCloudType;
    //@Column(name = "url")
    private String imageUrl;

    public Image(Integer id, String nameCloudType, String descriptionCloudType, String imageUrl) {
        this.id = id;
        this.nameCloudType = nameCloudType;
        this.descriptionCloudType = descriptionCloudType;
        this.imageUrl = imageUrl;
    }

    public Image (Integer id, String name, String imageUrl){
        this.id = id;
        this.nameCloudType = name;
        this.imageUrl = imageUrl;
    };

    public Image() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNameCloudType() {
        return nameCloudType;
    }

    public void setNameCloudType(String nameCloudType) {
        this.nameCloudType = nameCloudType;
    }

    public String getDescriptionCloudType() {
        return descriptionCloudType;
    }

    public void setDescriptionCloudType(String descriptionCloudType) {
        this.descriptionCloudType = descriptionCloudType;
    }
}
