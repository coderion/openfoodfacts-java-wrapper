package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model.ProductResponse;
import pl.coderion.openfoodfacts.openfoodfactsjavawrapper.rest.DefaultRestApiClient;
import pl.coderion.openfoodfacts.openfoodfactsjavawrapper.rest.RestApiClient;

@Service
public class DefaultProductService implements ProductService {

    private RestApiClient restApiClient;

    public DefaultProductService() {
        this.restApiClient = new DefaultRestApiClient();
    }

    @Override
    public ProductResponse findProductByCode(String code) {
        ResponseEntity<ProductResponse> responseEntity = restApiClient.get(String.format("/product/%s.json", code), ProductResponse.class);
        return responseEntity.getBody();
    }
}
