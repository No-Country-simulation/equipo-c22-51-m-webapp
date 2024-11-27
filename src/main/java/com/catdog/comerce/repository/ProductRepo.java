package com.catdog.comerce.repository;

import com.catdog.comerce.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductRepo extends RepoGeneric<Product,Long> {

    @Query(
            "SELECT COUNT (p)>0 from Product p where p.codeByBranch=:codeByBranch and p.brand.idBrand=:branch and p.idProduct!=:id"
    )
    boolean validateDuplicate(String codeByBranch,Long branch,Long id);


}
