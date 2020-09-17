package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.config;

public interface ConstantValues {

    String WRAPPER_VERSION = "0.0.1";

    String API_URL = "https://world.openfoodfacts.org/api";

    String API_VERSION = "0";

    String USER_AGENT = String.format("OpenFoodFacts-Java-Wrapper - Java - Version %s - www.coderion.pl", WRAPPER_VERSION);
}
