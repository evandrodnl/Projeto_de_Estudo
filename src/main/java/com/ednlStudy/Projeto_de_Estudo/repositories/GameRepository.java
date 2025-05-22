package com.ednlStudy.Projeto_de_Estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ednlStudy.Projeto_de_Estudo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
