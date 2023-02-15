package controllers;

import com.google.inject.Inject;
import play.mvc.Http;
import play.mvc.Result;
import service.ProductService;

import java.io.IOException;

import static play.mvc.Results.ok;

public class ProductController {
    @Inject
    private ProductService productService;

    public Result index() {
        return ok("Success");
    }

    public Result addProduct (Http.Request request) throws IOException {
        productService.addProduct(request);
        return ok("Data inserted");
    }
    public Result getProduct (Http.Request request) throws IOException {
        return ok(productService.getProduct(request));
    }
}
