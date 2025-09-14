package com.drr.ucompensar.repository;

import com.drr.ucompensar.core.GenericRepository;
import com.drr.ucompensar.entity.InventarioEntity;

public interface InventarioRepository extends GenericRepository<InventarioEntity, Long> {
	
	InventarioEntity inventarioXProducto(Long idProducto);

}
