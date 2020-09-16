package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class Product {

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("generic_name")
    private String genericName;

    @JsonProperty("created_t")
    private long createdT;

    @JsonProperty("codes_tags")
    private String[] codesTags;

    @JsonProperty("image_nutrition_small_url")
    private String imageNutritionSmallUrl;

    @JsonProperty("image_thumb_url")
    private String imageThumbUrl;

    @JsonProperty("image_ingredients_url")
    private String imageIngredientsUrl;

    @JsonProperty("nutrition_score_warning_no_fruits_vegetables_nuts")
    private int nutritionScoreWarningNoFruitsVegetablesNuts;

    private String quantity;

    @JsonProperty("no_nutrition_data")
    private String noNutritionData;

    private double completeness;

    @JsonProperty("nova_groups")
    private String novaGroups;

    @JsonProperty("nova_groups_tags")
    private String[] novaGroupsTags;

    @JsonProperty("net_weight_value")
    private String netWeightValue;

    private int rev;

    @JsonProperty("amino_acids_tags")
    private String[] aminoAcidsTags;

    private String stores;

    @JsonProperty("stores_tags")
    private String[] storesTags;

    @JsonProperty("additives_tags")
    private String[] additivesTags;

    @JsonProperty("additives_original_tags")
    private String[] additivesOriginalTags;

    @JsonProperty("ingredients_tags")
    private String[] ingredientsTags;

    @JsonProperty("ingredients_ids_debug")
    private String[] ingredientsIdsDebug;

    @JsonProperty("ingredients_n_tags")
    private String[] ingredientsNTags;

    @JsonProperty("_keywords")
    private String[] keywords;
}
