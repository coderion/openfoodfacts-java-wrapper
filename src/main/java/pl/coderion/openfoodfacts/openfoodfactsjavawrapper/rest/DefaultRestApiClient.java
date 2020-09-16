package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Slf4j
@Component
public class DefaultRestApiClient implements RestApiClient {

    @Autowired
    private RestOperations restTemplate;

    @Autowired
    private BuildProperties buildProperties;

    @Value("${openfoodfacts.api.url:https://world.openfoodfacts.org}")
    private String apiUrl;

    @Value("${openfoodfacts.api.version:0}")
    private String apiVersion;

    @Override
    public HttpHeaders httpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        headers.add(HttpHeaders.USER_AGENT, String.format("OpenfoodfactsJavaWrapper - Java - Version %s - www.coderion.pl", buildProperties.getVersion()));
        return headers;
    }

    @Override
    public <T> ResponseEntity<T> get(String url, Class<T> responseType) {
        url = String.format("%s/api/v%s/%s", apiUrl, apiVersion, url);
        log.debug("GET " + url);
        ResponseEntity<T> responseEntity = restTemplate.getForEntity(url, responseType);
        return responseEntity;
    }
}