package com.example.pokemon.controllers;


import com.example.pokemon.models.Pokemon;
import com.example.pokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PokemonController {
    @Autowired
    private PokemonRepository pokemonRepository;


    @GetMapping("/")
    public String index(Model model) {
        Iterable<Pokemon> pokemons = pokemonRepository.findAll();
        model.addAttribute("pokemon", pokemons);



        return "index.html";
    }


}
