package com.catdog.comerce.service;

import com.catdog.comerce.dto.request.ProductDto;
import com.catdog.comerce.entity.Product;

import java.util.List;

public interface IProductService extends ICrudService<ProductDto,Long>{
    List<Product> findAllProducts();
}
