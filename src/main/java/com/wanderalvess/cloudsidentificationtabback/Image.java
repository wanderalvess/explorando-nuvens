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
    private String title;
    //@Column(name = "descricao")
    private String description;
    //@Column(name = "url")
    private String imageUrl;

    public Image(Integer id, String title, String description, String imageUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
