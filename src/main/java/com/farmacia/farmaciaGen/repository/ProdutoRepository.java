package com.farmacia.farmaciaGen.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.farmacia.farmaciaGen.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	
	public List <Produto> findByPrecoBetween(@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);

}
