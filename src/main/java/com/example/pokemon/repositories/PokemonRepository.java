package com.example.pokemon.repositories;


import com.example.pokemon.models.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;


public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {

}

