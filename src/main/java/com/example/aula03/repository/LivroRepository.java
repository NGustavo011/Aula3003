package com.example.aula03.repository;

import java.util.HashMap;

import com.example.aula03.model.Livro;

import org.springframework.stereotype.Repository;

/**
 * LivroRepository
 */
@Repository
public class LivroRepository {
    public HashMap<Integer, Livro> hmLivro = new HashMap<Integer, Livro>();
    int cont = 0;
    
    

    public void addLivroRepository(Livro l)
    {
        hmLivro.put(cont, l);
        cont++;
    }

    public HashMap<Integer, Livro> getLivro()
    {
        return hmLivro;
    }
}