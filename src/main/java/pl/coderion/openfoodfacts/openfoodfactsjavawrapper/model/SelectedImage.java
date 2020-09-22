package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import lombok.Data;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class SelectedImage {

    private SelectedImageItem display;

    private SelectedImageItem small;

    private SelectedImageItem thumb;
}
