package com.ygorportes.api_rest.service;

import com.ygorportes.api_rest.model.Product;

import java.util.List;

public interface ProdutcService {

    List<Product> findAll();
    Product findById(Long id);
    Product save(Product product);
    void deleteById(Long id);
}
