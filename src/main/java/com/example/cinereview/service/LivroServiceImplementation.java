package com.example.cinereview.service;

import com.example.cinereview.model.Livro;
import com.example.cinereview.repositorio.LivroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImplementation implements LivroService {
    @Autowired
    private LivroRepositorio livroRepositorio;
    @Override
    public Livro novoLivro(Livro livro) {
        return livroRepositorio.save(livro);
    }

    @Override
    public List<Livro> listarLivros() {
        return livroRepositorio.findAll();
    }

}

