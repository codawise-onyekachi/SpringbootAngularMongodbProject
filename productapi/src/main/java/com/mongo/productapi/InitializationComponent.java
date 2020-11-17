package com.mongo.productapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitializationComponent {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    private void init(){

        productRepository.deleteAll();

        Product product = new Product();
        product.setName("Samsung D3");
        product.setCode("SAMSUNG-TRIDES");
        product.setTitle("Samsung Trios 12 inch");
        product.setDescription("Samsung Trio 12 Touch");
        product.setImgUrl("Samsung.jpg");
        product.setPrice(9899.00);
        productRepository.save(product);

        Product product1 = new Product();
        product1.setName("Nokia D3");
        product1.setCode("NOKIA-TRIDES");
        product1.setTitle("Nokia Trios 12 inch");
        product1.setDescription("Nokia Trio 12 Touch");
        product1.setImgUrl("Nokia.jpg");
        product1.setPrice(7899.00);
        productRepository.save(product1);



    }
}
