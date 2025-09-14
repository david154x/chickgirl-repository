package com.drr.ucompensar.core;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Getter;

@ApplicationScoped
public class JpaUtil {
	
	@PersistenceContext(unitName="ChickGirlPU")
	@Getter
	private EntityManager entityManager;
	
}
