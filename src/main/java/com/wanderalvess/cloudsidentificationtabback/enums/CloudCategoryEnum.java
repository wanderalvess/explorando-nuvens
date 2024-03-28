package com.wanderalvess.cloudsidentificationtabback.enums;

public enum CloudCategoryEnum {
    CIRRUS("Cirrus"),
    STRATUS("Stratus"),
    STRATOCUMULUS("Stratocumulus"),
    ALTOCUMULUS("Altocumulus"),
    CUMULONIMBUS("Cumulonimbus"),
    NIMBOSTRATUS("Nimbostratus"),
    CIRROSTRATUS("Cirrostratus"),
    CIRROCUMULUS("Cirrocumulus"),
    ALTOSTRATUS("Altostratus"),
    CUMULUS("Cumulus"),
    ERROR("Categoria não encontrada");

    private final String categoryName;

    CloudCategoryEnum(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return "CloudCategoryEnum{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }

    public static CloudCategoryEnum fromString(String text) {
        for (CloudCategoryEnum category : CloudCategoryEnum.values()) {
            if (category.categoryName.equalsIgnoreCase(text)) {
                return category;
            }
        }
        return null; // or throw IllegalArgumentException
    }
}
