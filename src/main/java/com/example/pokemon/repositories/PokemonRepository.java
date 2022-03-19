package com.example.pokemon.repositories;


import com.example.pokemon.models.Pokemon;
import org.springframework.data.repository.CrudRepository;



public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {

}

