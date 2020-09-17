package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class Nutriments {

    private float carbohydrates;

    @JsonProperty("carbohydrates_value")
    private float carbohydratesValue;

    @JsonProperty("carbohydrates_100g")
    private float carbohydrates100G;

    @JsonProperty("carbohydrates_serving")
    private float carbohydratesServing;

    @JsonProperty("carbohydrates_unit")
    private String carbohydratesUnit;

    @JsonProperty("carbon-footprint-from-known-ingredients_product")
    private float carbonFootprintFromKnownIngredientsProduct;

    @JsonProperty("carbon-footprint-from-known-ingredients_100g")
    private float carbonFootprintFromKnownIngredients100G;

    @JsonProperty("carbon-footprint-from-known-ingredients_serving")
    private float carbonFootprintFromKnownIngredientsServing;

    private int energy;

    @JsonProperty("energy_value")
    private int energyValue;

    @JsonProperty("energy_100g")
    private int energy100G;

    @JsonProperty("energy_serving")
    private int energyServing;

    @JsonProperty("energy_unit")
    private String energyUnit;

    private float fat;

    @JsonProperty("fat_value")
    private float fatValue;

    @JsonProperty("fat_100g")
    private float fat100G;

    @JsonProperty("fat_serving")
    private float fatServing;

    @JsonProperty("fat_unit")
    private String fatUnit;

    @JsonProperty("nova-group")
    private float novaGroup;

    @JsonProperty("nova-group_100g")
    private float novaGroup100G;

    @JsonProperty("nova-group_serving")
    private float novaGroupServing;

    private float proteins;

    @JsonProperty("proteins_value")
    private float proteinsValue;

    @JsonProperty("proteins_100g")
    private float proteins100G;

    @JsonProperty("proteins_serving")
    private float proteinsServing;

    @JsonProperty("proteins_unit")
    private String proteinsUnit;

    private float salt;

    @JsonProperty("salt_value")
    private float saltValue;

    @JsonProperty("salt_100g")
    private float salt100G;

    @JsonProperty("salt_serving")
    private float saltServing;

    @JsonProperty("salt_unit")
    private String saltUnit;

    @JsonProperty("saturated-fat")
    private float saturatedFat;

    @JsonProperty("saturated-fat_value")
    private float saturatedFatValue;

    @JsonProperty("saturated-fat_100g")
    private float saturatedFat100G;

    @JsonProperty("saturated-fat_serving")
    private float saturatedFatServing;

    @JsonProperty("saturated-fat_unit")
    private String saturatedFatUnit;

    private float sodium;

    @JsonProperty("sodium_value")
    private float sodiumValue;

    @JsonProperty("sodium_100g")
    private float sodium100G;

    @JsonProperty("sodium_serving")
    private float sodiumServing;

    @JsonProperty("sodium_unit")
    private String sodiumUnit;

    private float sugars;

    @JsonProperty("sugars_value")
    private float sugarsValue;

    @JsonProperty("sugars_100g")
    private float sugars100G;

    @JsonProperty("sugars_serving")
    private float sugarsServing;

    @JsonProperty("sugars_unit")
    private String sugarsUnit;
}