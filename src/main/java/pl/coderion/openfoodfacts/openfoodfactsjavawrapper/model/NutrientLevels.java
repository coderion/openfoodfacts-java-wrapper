package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class NutrientLevels {

    private String fat;

    private String salt;

    @JsonProperty("saturated-fat")
    private String saturatedFat;

    private String sugars;
}
