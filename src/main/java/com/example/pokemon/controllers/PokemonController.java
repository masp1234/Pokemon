package com.example.pokemon.controllers;


import com.example.pokemon.models.Pokemon;
import com.example.pokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PokemonController {
    @Autowired
    private PokemonRepository pokemonRepository;


    @GetMapping("/")
    public String index() {
        return "index.html";
    }
    @GetMapping("/allPokemon")
    public String allPokemon(Model model) {
        Iterable<Pokemon> pokemons = pokemonRepository.findAll();
        model.addAttribute("pokemon", pokemons);
        return "all-pokemon.html";
    }
    /*@DeleteMapping("/allPokemon/{id}")
    public void deletePokemon(@PathVariable String id) {
        Integer pokemonId = Integer.parseInt(id);
        pokemonRepository.deleteById(pokemonId);
    }

     */



}
