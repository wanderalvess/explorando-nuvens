package com.wanderalvess.cloudsidentificationtabback.enums;

public enum WeatherCategoryEnum {
    CLEAR_DAY("clear_day"),
    CLEAR_NIGHT("clear_night"),
    CLOUD("cloud"),
    CLOUDLY_DAY("cloudly_day"),
    CLOUDLY_NIGHT("cloudly_night"),
    FOG("fog"),
    RAIN("rain"),
    SNOW("snow"),
    STORM("storm"),
    ERROR("Categoria não encontrada");

    private final String weatherCategory;

    WeatherCategoryEnum(String weatherCategory){
        this.weatherCategory = weatherCategory;
    }

    public String getWeatherCategory(){
        return weatherCategory;
    }

    public static WeatherCategoryEnum fromString(String text) {
        for (WeatherCategoryEnum weatherCategory : WeatherCategoryEnum.values()) {
            if (weatherCategory.weatherCategory.equalsIgnoreCase(text)) {
                return weatherCategory;
            }
        }
        return null; // or throw IllegalArgumentException
    }
}
