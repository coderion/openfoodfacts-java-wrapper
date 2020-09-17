package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model.ProductResponse;
import pl.coderion.openfoodfacts.openfoodfactsjavawrapper.rest.RestApiClient;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private RestApiClient restApiClient;

    @GetMapping("test")
    public ResponseEntity<ProductResponse> findTestProduct() {
        return restApiClient.get("/product/737628064502.json", ProductResponse.class);
    }

    @GetMapping("{barcode}")
    public ResponseEntity<ProductResponse> findProduct(@PathVariable("barcode") String barcode) {
        return restApiClient.get(String.format("/product/%s.json", barcode), ProductResponse.class);
    }
}
