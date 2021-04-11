package com.example.Trabajo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/usuarios"})
public class Controlador {

    @Autowired
    UsuarioService service;

    @GetMapping
    public List<Usuario> Listar() {
        return service.listar();

    }
}
