package com.gabrielgodoi.dslist.services;

import com.gabrielgodoi.dslist.DTO.GameMinDTO;
import com.gabrielgodoi.dslist.entities.Game;
import com.gabrielgodoi.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    // componentes são injetados em parte do sistema, para que o sistema seja composto e interligado
    // injetando uma instancia do gameRepository dentro do GameService
    @Autowired
    private GameRepository gameRepository;

    public GameService() {
    }

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
