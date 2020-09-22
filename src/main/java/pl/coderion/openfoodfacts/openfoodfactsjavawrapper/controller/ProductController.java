package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model.ProductResponse;
import pl.coderion.openfoodfacts.openfoodfactsjavawrapper.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("test")
    public ResponseEntity<ProductResponse> findTestProduct() {
        return ResponseEntity.ok(productService.findProductByCode("737628064502"));
    }

    @GetMapping("{code}")
    public ResponseEntity<ProductResponse> findProduct(@PathVariable("code") String code) {
        return ResponseEntity.ok(productService.findProductByCode(code));
    }
}
