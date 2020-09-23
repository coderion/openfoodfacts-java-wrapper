# OpenFoodFacts Java Wrapper

##### Java (Maven) wrapper for https://world.openfoodfacts.org

## Current version 0.0.10

## Usage

Add one dependency in your POM:

```xml
<dependencies>
    <dependency>
        <groupId>pl.coderion.openfoodfacts</groupId>
        <artifactId>openfoodfacts</artifactId>
        <version>0.0.10</version>
        <classifier>java-wrapper</classifier>
    </dependency>
</dependencies>
```

Create product service class and find product by its barcode:

```javascript
ProductService productService = new DefaultProductService();
ProductResponse response = productService.findProductByCode("737628064502");
```

## Demo

Check also [Demo application](https://github.com/coderion/openfoodfacts-java-wrapper-demo) how to do it