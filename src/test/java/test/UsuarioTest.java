package test;

import com.drr.ucompensar.usuario.model.entity.UsuarioEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UsuarioTest {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ChickGirlPU-local");
        EntityManager em = emf.createEntityManager();

        // Iniciar transacción
        em.getTransaction().begin();

        // Crear usuario
        UsuarioEntity usuario = new UsuarioEntity();
        usuario.setNombre("Juan Pérez");
        em.persist(usuario);

        em.getTransaction().commit();

        // Consultar
        UsuarioEntity encontrado = em.find(UsuarioEntity.class, usuario.getId());
        System.out.println("Usuario guardado: " + encontrado.getNombre());

        em.close();
        emf.close();
		
	}

}
