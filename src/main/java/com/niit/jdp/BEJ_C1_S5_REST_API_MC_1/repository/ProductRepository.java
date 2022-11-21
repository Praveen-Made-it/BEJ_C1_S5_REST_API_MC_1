package com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.repository;

import com.niit.jdp.BEJ_C1_S5_REST_API_MC_1.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
