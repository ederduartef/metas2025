package com.metas2025.controllers;

import com.metas2025.models.tabelaMetas;
import com.metas2025.repositories.MetaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/metas")
public class MetaController {

    private MetaRepository metaRepository;

    //Injeção por contrutor
    public MetaController(MetaRepository metaRepository) {
        this.metaRepository = metaRepository;
    }

    // Página e formulário
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("metas", metaRepository.findAll());
        model.addAttribute("meta", new tabelaMetas()); //objeto vazio
        return "metas"; // renderização
    }

    //Salva e retorna
    @PostMapping
    public String salvar(@ModelAttribute("meta") tabelaMetas tabela) {
        metaRepository.save(tabela);
        return "redirect:/metas";
    }




}
