package com.example.aula03.controller;

import com.example.aula03.model.Livro;
import com.example.aula03.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * LivroController
 */
@Controller
@RequestMapping("/app")
public class LivroController {
    
    @Autowired
    private LivroService lr;

    @GetMapping("/livros")
    public ModelAndView getLivros()
    {
        ModelAndView mv = new ModelAndView("LivrosView");
        mv.addObject("livro", lr.getLivroService().values());
        return mv;
    }

    @PostMapping("/livros")
    public ModelAndView cadastroForm(@ModelAttribute Livro livro) {
        ModelAndView mv = new ModelAndView("LivrosView");
        lr.addLivroService(livro);
        mv.addObject("livro", lr.getLivroService().values());
        return mv;
    }
    

}