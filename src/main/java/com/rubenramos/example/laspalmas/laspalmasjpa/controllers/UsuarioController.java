package com.rubenramos.example.laspalmas.laspalmasjpa.controllers;

import com.rubenramos.example.laspalmas.laspalmasjpa.models.entity.Usuario;
import com.rubenramos.example.laspalmas.laspalmasjpa.models.interfaces.IUsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    IUsuarioDao iUsuarioDao;

    @GetMapping("/listar")
    public String getAll(Model model) {
        List<Usuario> listarUsuario = iUsuarioDao.listUsuario();
        model.addAttribute("titulo", "Usuario");
        model.addAttribute("listaUsuarios", listarUsuario);
        return "listar";
    }

    @GetMapping("/form")
    public String createUsuario(Model model) {
        Usuario usuario = new Usuario();
        model.addAttribute("titulo", "Formulario de usuario");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String save(Usuario usuario) {
        iUsuarioDao.createUsuario(usuario);
        return "redirect:listar";
    }

}
