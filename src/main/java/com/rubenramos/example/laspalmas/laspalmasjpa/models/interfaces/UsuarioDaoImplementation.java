package com.rubenramos.example.laspalmas.laspalmasjpa.models.interfaces;

import com.rubenramos.example.laspalmas.laspalmasjpa.models.entity.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UsuarioDaoImplementation implements IUsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    @Override
    public List<Usuario> listUsuario() {
        return entityManager.createQuery("from Usuario").getResultList();
    }

    @Transactional
    @Override
    public void createUsuario(Usuario usuario) {
        entityManager.persist(usuario);
    }
}
