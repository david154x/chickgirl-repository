package com.drr.ucompensar.repository;

import com.drr.ucompensar.core.impl.GenericRepositoryImpl;
import com.drr.ucompensar.entity.UsuarioEntity;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepositoryImpl extends GenericRepositoryImpl<UsuarioEntity, Integer> implements UsuarioRepository {
	
	public UsuarioRepositoryImpl() {
		super(UsuarioEntity.class);
	}

}
