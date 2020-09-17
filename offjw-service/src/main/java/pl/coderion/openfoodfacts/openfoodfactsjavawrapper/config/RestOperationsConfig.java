package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (C) Coderion sp. z o.o.
 */
@Configuration
public class RestOperationsConfig {

    @Bean
    public RestOperations restTemplate() {
        return new RestTemplate();
    }
}
