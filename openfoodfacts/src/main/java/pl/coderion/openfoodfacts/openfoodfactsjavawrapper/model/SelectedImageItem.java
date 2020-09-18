package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class SelectedImageItem {

    private String en;

    private String fr;

    private String pl;

    public String getUrl() {
        return ObjectUtils.firstNonNull(en, fr, pl);
    }
}
