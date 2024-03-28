package com.wanderalvess.cloudsidentificationtabback;

public class Image {
    private Integer id;
    private String nameCloudType;
    private String titleCloudType;
    private String descriptionCloudType;
    private String imageUrl;

    public Image(Integer id, String nameCloudType, String titleCloudType, String descriptionCloudType, String imageUrl) {
        this.id = id;
        this.nameCloudType = nameCloudType;
        this.titleCloudType = titleCloudType;
        this.descriptionCloudType = descriptionCloudType;
        this.imageUrl = imageUrl;
    }

    public Image(Integer id, String name, String imageUrl) {
        this.id = id;
        this.nameCloudType = name;
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

    public String getTitleCloudType() {
        return titleCloudType;
    }

    public void setTitleCloudType(String titleCloudType) {
        this.titleCloudType = titleCloudType;
    }
}
