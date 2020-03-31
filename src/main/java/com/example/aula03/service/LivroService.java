package com.example.aula03.service;

import java.util.HashMap;

import com.example.aula03.model.Livro;
import com.example.aula03.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * LivroService
 */
@Service
public class LivroService {

    @Autowired
    private LivroRepository lr;

    public void addLivroService(Livro l)
    {
        boolean encontrado = false;
        for (Livro aux : lr.getLivro().values()) 
            if(l.getNome().equals(aux.getNome()))
                if((l.getAutor().equals(aux.getAutor())) && (l.getEdicao().equals(aux.getEdicao())))
                    encontrado = true;
        if(!encontrado)
        {
            lr.addLivroRepository(l);
        }
        
    }

    public HashMap<Integer, Livro> getLivroService()
    {
        HashMap<Integer, Livro> livro = lr.getLivro();
        return livro;
    }
}