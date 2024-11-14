package com.gabrielgodoi.dslist.controller;

import com.gabrielgodoi.dslist.DTO.GameListDTO;
import com.gabrielgodoi.dslist.DTO.GameMinDTO;
import com.gabrielgodoi.dslist.services.GameListService;
import com.gabrielgodoi.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    // o autowired é usado para fazermos a injeção de dependência do serviço
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return this.gameListService.getAllLists();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
