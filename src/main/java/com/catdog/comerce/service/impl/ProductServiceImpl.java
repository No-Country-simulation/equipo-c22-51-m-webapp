package com.catdog.comerce.service.impl;

import com.catdog.comerce.dto.request.AccesoryDto;
import com.catdog.comerce.dto.request.FoodDto;
import com.catdog.comerce.dto.request.HygieneDto;
import com.catdog.comerce.dto.request.ProductDto;
import com.catdog.comerce.dto.response.ResponseBrandDto;
import com.catdog.comerce.dto.response.ResponseCategoryDto;
import com.catdog.comerce.dto.response.ResponseFoodDto;
import com.catdog.comerce.dto.response.ResponseProductDto;
import com.catdog.comerce.entity.*;
import com.catdog.comerce.exception.AlreadyExistsException;
import com.catdog.comerce.exception.NotFoundException;
import com.catdog.comerce.repository.*;
import com.catdog.comerce.service.IProductService;
import com.catdog.comerce.utils.MapperUtil;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ProductServiceImpl extends CrudServiceImpl<ProductDto, Product,Long> implements IProductService {
    private final ProductRepo productRepo;
    private final AccesoryRepo accesoryRepo;
    private final FoodRepo foodRepo;
    private final HygieneRepo hygieneRepo;
    private final CategoryRepo categoryRepo;
    private final BrandRepo brandRepo;

    public ProductServiceImpl(MapperUtil mapperUtil, ProductRepo productRepo, AccesoryRepo accesoryRepo, FoodRepo foodRepo, HygieneRepo hygieneRepo, CategoryRepo categoryRepo, BrandRepo brandRepo) {
        super(mapperUtil);
        this.productRepo = productRepo;
        this.accesoryRepo = accesoryRepo;
        this.foodRepo = foodRepo;
        this.hygieneRepo = hygieneRepo;
        this.categoryRepo = categoryRepo;
        this.brandRepo = brandRepo;
    }

    @Override
    protected RepoGeneric<Product, Long> getRepo() {
        return productRepo;
    }

    @Override
    protected Class<Product> getEntityClass() {
        return Product.class;
    }

    @Override
    protected Class<ProductDto> getDtoClass() {
        return ProductDto.class;
    }

    @Override
    protected void setId(Product entity, Long aLong) {
        entity.setIdProduct(aLong);
    }

    @Override
    public List<Product> findAllProducts() {
        return List.of();
    }
}
