package com.github.andclima.demo.controller;

import com.github.andclima.demo.model.Cliente;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @GetMapping("/clientes")
    public Cliente obtemCliente() {
        return new Cliente("111.111.111-11", "Fulano de Tal", "fulano@gmail.com", "(86) 99999-1234");
    }

    @PostMapping("/clientes")
    public String postCliente() {
        return "POST Cliente funcionando!";
    }

    @PutMapping("/clientes")
    public String putCliente() {
        return "PUT Cliente funcionando!";
    }

    @DeleteMapping("/clientes")
    public String deleteCliente() {
        return "DELETE Cliente funcionando!";
    }
}
