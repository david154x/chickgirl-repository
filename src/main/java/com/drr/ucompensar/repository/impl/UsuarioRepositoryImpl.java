package com.drr.ucompensar.repository.impl;

import com.drr.ucompensar.core.impl.GenericRepositoryImpl;
import com.drr.ucompensar.entity.UsuarioEntity;
import com.drr.ucompensar.repository.UsuarioRepository;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepositoryImpl extends GenericRepositoryImpl<UsuarioEntity, Long> implements UsuarioRepository {
	
	public UsuarioRepositoryImpl() {
		super(UsuarioEntity.class);
	}

}
