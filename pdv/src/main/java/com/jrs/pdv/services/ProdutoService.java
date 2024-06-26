package com.jrs.pdv.services;

import com.jrs.pdv.entities.Produto;
import com.jrs.pdv.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }
}
