package com.mipatito.repository;

import com.mipatito.model.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {

    public Usuario guardarUsuario(Usuario usuario) {
        persist(usuario);
        return usuario;
    }

    public Usuario obtenerUsuario(Long id) {
        return findById(id);
    }

    public Usuario actualizarUsuario(Usuario usuario) {
        return getEntityManager().merge(usuario);
    }

    public void eliminarUsuario(Long id) {
        Usuario usuario = findById(id);
        if (usuario != null) {
            delete(usuario);
        }
    }
}

