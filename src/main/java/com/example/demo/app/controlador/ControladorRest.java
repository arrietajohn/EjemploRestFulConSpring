/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.app.controlador;

import com.example.demo.app.entity.Product;
import com.example.demo.app.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
public class ControladorRest {
    
    @Autowired
    private ProductService service;
    
    @GetMapping("/products")    
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    
    @GetMapping("/products/{id}")    
    public Product findProductsId(@PathVariable int id){
        return service.getProductById(id);
    }
    
    
    @PostMapping("/products")
    public ResponseEntity addProduct(@RequestBody Product product){
        service.saveProduct(product);
        return ResponseEntity.status(201).build();
    }
    
    
    @PutMapping("/products")
       public ResponseEntity updateProduct(@RequestBody Product product){
       service.updateProduct(product);
       return ResponseEntity.status(201).build();
    }
       
    @DeleteMapping("/products")
      public ResponseEntity deleteProduct(@RequestBody Product product){
           service.deleteProduct(product.getId());
           return ResponseEntity.status(204).build();
      }
       
       
       
    
}
