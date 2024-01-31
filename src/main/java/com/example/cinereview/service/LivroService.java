package com.example.cinereview.service;

import com.example.cinereview.model.Livro;

import java.util.List;

public interface LivroService {
    public Livro novoLivro(Livro livro);
    public List<Livro> listarLivros();
}
