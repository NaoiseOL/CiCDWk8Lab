package ie.atu.wk6;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private static ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    private List<Product> myList = new ArrayList<>();

    public static void saveProduct(Product product){
        productRepository.save(product);
        System.out.print("Person Saved");
    }

    @GetMapping
    public List<Product> getProducts(){
        return myList;
    }

    @PostMapping
    public List<Product> addProduct(Product product)
    {
        //Do business stuff like retrieving details from db, or generating files pdfs
        myList.add(product);
        return myList;
    }
}
