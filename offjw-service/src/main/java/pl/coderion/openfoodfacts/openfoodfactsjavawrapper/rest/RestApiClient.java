package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public interface RestApiClient {

    HttpHeaders httpHeaders();

    <T> ResponseEntity<T> get(String url, Class<T> responseType);
}
