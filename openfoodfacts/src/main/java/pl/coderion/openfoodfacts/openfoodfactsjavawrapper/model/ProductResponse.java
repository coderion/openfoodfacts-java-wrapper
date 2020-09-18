package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class ProductResponse {

    private Product product;

    private String code;

    private boolean status;

    @JsonProperty("status_verbose")
    private String statusVerbose;
}
