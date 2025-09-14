package com.drr.ucompensar.repository.impl;

import com.drr.ucompensar.core.JpaUtil;
import com.drr.ucompensar.core.impl.GenericRepositoryImpl;
import com.drr.ucompensar.entity.InventarioEntity;
import com.drr.ucompensar.repository.InventarioRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class InventarioRepositoryImpl extends GenericRepositoryImpl<InventarioEntity, Long> implements InventarioRepository {

	public InventarioRepositoryImpl() {
		super(InventarioEntity.class);
	}
	
	@Inject
	private JpaUtil jpaUtil;

	@Override
	public InventarioEntity inventarioXProducto(Long idProducto) {
		try {
			StringBuilder stBuild = new StringBuilder();
			stBuild.append("SELECT inv FROM InventarioEntity inv \n")
				   .append("WHERE \n")
				   .append("inv.producto.id = :idProducto \n");
			
			TypedQuery<InventarioEntity> query = this.jpaUtil.getEntityManager().createQuery(stBuild.toString(), InventarioEntity.class);
			
			query.setParameter("idProducto", idProducto);
			
			return query.getSingleResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
