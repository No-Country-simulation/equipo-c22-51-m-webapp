package com.catdog.comerce.dto.response;
import com.catdog.comerce.dto.request.AccesoryDto;
import com.catdog.comerce.dto.request.FoodDto;
import com.catdog.comerce.dto.request.HygieneDto;
import com.catdog.comerce.entity.Accesory;
import com.catdog.comerce.entity.Food;
import com.catdog.comerce.entity.Hygiene;
import com.catdog.comerce.enums.PetType;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Map;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseProductDto {
    private Long idProduct;
    @JsonProperty("product_code")
    private String productCode;
    @JsonProperty("code_branch")
    private String codeByBranch;
    private String name;
    private BigDecimal price;
    private Integer stock;
    private String description;
    private ResponseCategoryDto category;
    private ResponseBrandDto brand;
    @JsonProperty("pet_type")
    private PetType petType;
    @JsonProperty("image_product")
    private String imageProduct;
}
