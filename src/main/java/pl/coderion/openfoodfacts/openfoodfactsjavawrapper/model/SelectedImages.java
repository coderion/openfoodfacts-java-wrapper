package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model;

import lombok.Data;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Data
public class SelectedImages {

    private SelectedImage front;

    private SelectedImage ingredients;

    private SelectedImage nutrition;
}
