package com.jrs.pdv.controllers;

import com.jrs.pdv.entities.Produto;
import com.jrs.pdv.services.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    public List<Produto> getAll(){
        return produtoService.findAll();
    }
}
