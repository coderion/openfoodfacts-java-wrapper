package pl.coderion.openfoodfacts.openfoodfactsjavawrapper.rest;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class RestApiResponse<T> implements Serializable {

    private T body;

    private HttpStatus httpStatus;

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
