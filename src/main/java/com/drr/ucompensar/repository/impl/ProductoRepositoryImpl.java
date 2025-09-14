package com.drr.ucompensar.repository.impl;

import com.drr.ucompensar.core.impl.GenericRepositoryImpl;
import com.drr.ucompensar.entity.ProductoEntity;
import com.drr.ucompensar.repository.ProductoRepository;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductoRepositoryImpl extends GenericRepositoryImpl<ProductoEntity, Long> implements ProductoRepository {

	public ProductoRepositoryImpl() {
		super(ProductoEntity.class);
	}

}
