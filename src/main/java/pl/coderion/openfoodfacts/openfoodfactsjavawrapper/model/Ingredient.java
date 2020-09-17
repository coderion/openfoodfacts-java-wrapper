package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class Ingredient {

    @JsonProperty("from_palm_oil")
    private String fromPalmOil;

    private String id;

    private String origin;

    private String percent;

    private int rank;

    private String text;

    private String vegan;

    private String vegetarian;
}
