package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.service;

import pl.coderion.openfoodfacts.openfoodfactsjavawrapper.model.ProductResponse;

public interface ProductService {

    /**
     * Find product by its code (barcode)
     * @param code
     * @return
     */
    ProductResponse findProductByCode(String code);
}
