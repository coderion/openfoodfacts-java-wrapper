package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class Images {

    Map<String, Object> other = new LinkedHashMap<>();

    @JsonAnySetter
    void setDetail(String key, Object value) {
        other.put(key, value);
    }
}
