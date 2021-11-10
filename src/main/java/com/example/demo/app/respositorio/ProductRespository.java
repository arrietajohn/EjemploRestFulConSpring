/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.app.respositorio;

import com.example.demo.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface ProductRespository extends JpaRepository<Product,Integer>{
    Product findByName(String name);  
    // findByID
    // findAll()
    // deleteAll
    // save()
    // deleteByID
}
