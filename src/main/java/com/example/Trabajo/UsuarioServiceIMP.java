/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Trabajo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kevin
 */
@Service
public class UsuarioServiceIMP implements UsuarioService {

    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public List<Usuario> listar() {
        return repositorio.findAll();
    }

}
