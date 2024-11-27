package com.catdog.comerce.controller;

import com.catdog.comerce.dto.GenericResponse;
import com.catdog.comerce.dto.response.ResponseProductDto;
import com.catdog.comerce.service.IProductService;
import com.catdog.comerce.utils.MapperUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/product")
public class ProductController {

    private final IProductService productService;
    private final MapperUtil mapperUtil;

    @GetMapping
    public ResponseEntity<GenericResponse<ResponseProductDto>> getProducts() {
        List<ResponseProductDto> responseProductDtoList = mapperUtil.mapList(productService.findAll(), ResponseProductDto.class);
        GenericResponse<ResponseProductDto> genericResponse = new GenericResponse<>(200,"success",responseProductDtoList);
        return new ResponseEntity<>(genericResponse, HttpStatus.OK);
    }



}
