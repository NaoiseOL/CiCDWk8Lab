package ie.atu.wk6;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myService;

    public ProductController(ProductService myService) {
        this.myService = myService;
    }

    private List<Product> list = new ArrayList<>();
    //creating a class which is interested in requests and responses

    @GetMapping
    public List<Product> getAllProducts(){
        list = myService.getProducts();
        return list;
    }

    @PostMapping
    public List<Product> newProduct(@RequestBody @Valid Product product){

        //send it to do business logic
        //ProductService myService = new ProductService();
        list = myService.addProduct(product);
        return list;
    }
}
