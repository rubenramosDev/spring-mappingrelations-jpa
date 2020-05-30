package com.rubenramos.example.laspalmas.laspalmasjpa.models.interfaces;

import com.rubenramos.example.laspalmas.laspalmasjpa.models.entity.Usuario;

import java.util.List;

public interface IUsuarioDao {

    public List<Usuario> listUsuario();

    public void createUsuario(Usuario usuario);

}
