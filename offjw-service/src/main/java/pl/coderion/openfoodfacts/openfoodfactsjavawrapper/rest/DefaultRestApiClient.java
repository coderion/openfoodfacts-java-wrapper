package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.coderion.openfoodfacts.openfoodfactsjavawrapper.config.ConstantValues;

@Slf4j
@Component
public class DefaultRestApiClient implements RestApiClient {

    @Override
    public HttpHeaders httpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        headers.add(HttpHeaders.USER_AGENT, ConstantValues.USER_AGENT);
        return headers;
    }

    @Override
    public <T> ResponseEntity<T> get(String url, Class<T> responseType) {
        url = String.format("%s/v%s%s", ConstantValues.API_URL, ConstantValues.API_VERSION, url);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<String>(httpHeaders());
        ResponseEntity<T> responseEntity = restTemplate.exchange(url, HttpMethod.GET, request, responseType);
        return responseEntity;
    }
}