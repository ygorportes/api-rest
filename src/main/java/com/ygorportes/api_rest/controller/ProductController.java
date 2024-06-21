package com.ygorportes.api_rest.controller;

import com.ygorportes.api_rest.model.Product;
import com.ygorportes.api_rest.service.ProdutcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProdutcService produtcService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return produtcService.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return produtcService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = produtcService.findById(id);

        if (product != null) {
            return ResponseEntity.ok(product);
        }

        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product product = produtcService.findById(id);

        if(product != null) {
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());

            return ResponseEntity.ok(produtcService.save(product));
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Product> deleteProduct(@PathVariable Long id) {
        Product product = produtcService.findById(id);

        if (product != null) {
            produtcService.deleteById(id);

            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
