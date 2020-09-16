package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
public interface RestApiClient {

    HttpHeaders httpHeaders();

    <T> ResponseEntity<T> get(String url, Class<T> responseType);
}
