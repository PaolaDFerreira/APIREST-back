package com.example.cinereview.controller;

import com.example.cinereview.model.Livro;
import com.example.cinereview.repositorio.LivroRepositorio;
import com.example.cinereview.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livro")
@CrossOrigin(origins = "http://localhost:3000")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @Autowired
    private LivroRepositorio livroRepositorio;

    @PostMapping("/add")
    public String add(@RequestBody Livro livro){
        livroService.novoLivro(livro);
        return "Voce adicionou um novo filme!";
    }

    @GetMapping("getAll")
    public List<Livro> listarLivros(){
        return livroService.listarLivros();
    }

    @PutMapping("/editFilme/{id}")
    Optional<Livro> updateFilme(@RequestBody Livro newLivro, @PathVariable Long id){
        return livroRepositorio.findById(id)
                .map(livro ->
                {
                    livro.setNome(newLivro.getNome());
                    livro.setAno(newLivro.getAno());
                    livro.setDiretor(newLivro.getDiretor());
                    return livroRepositorio.save(livro);
                });
    }

    @PutMapping("/editFilmeReview/{id}")
    Optional<Livro> updateFilmeReview(@RequestBody Livro newLivro, @PathVariable Long id){
        return livroRepositorio.findById(id)
                .map(livro ->
                {
                    livro.setAvaliacao(newLivro.getAvaliacao());
                    return livroRepositorio.save(livro);
                });
    }



    @DeleteMapping("/filme/{id}")
    String deleteUser(@PathVariable Long id){
        livroRepositorio.deleteById(id);
        return  "Você deletou o filme!";
    }


}
