package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import lombok.Data;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class Image {

    private ImageItem display;

    private ImageItem small;

    private ImageItem thumb;
}
