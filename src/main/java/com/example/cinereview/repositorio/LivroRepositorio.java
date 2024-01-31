package com.example.cinereview.repositorio;

import com.example.cinereview.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Long> {

}
