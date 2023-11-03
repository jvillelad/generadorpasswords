package com.mipatito.resource;

import com.mipatito.interfaces.PasswordGeneratorInterface;
import com.mipatito.dto.PasswordConfigDTO;
import com.mipatito.model.Usuario;
import com.mipatito.repository.UsuarioRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import jakarta.inject.Inject;

@Path("/password")
public class PasswordResource {

    @Inject
    PasswordGeneratorInterface passwordGenerator;

    @Inject
    UsuarioRepository usuarioRepository;

    @GET
    @Path("/generate/{length}")
    @Produces(MediaType.APPLICATION_JSON)
    public String generatePassword(@PathParam("length") int length) {
        return passwordGenerator.generatePassword(length);
    }

    @POST
    @Path("/generate")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String generatePassword(PasswordConfigDTO config) {
        return passwordGenerator.generatePassword(config);
    }

    @POST
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Usuario registerUser(Usuario usuario) {
        return usuarioRepository.guardarUsuario(usuario);
    }

    @GET
    @Path("/user/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getUser(@PathParam("id") Long id) {
        return usuarioRepository.obtenerUsuario(id);
    }
}

