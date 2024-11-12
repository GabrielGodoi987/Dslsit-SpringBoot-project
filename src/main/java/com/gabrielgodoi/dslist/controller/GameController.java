package com.gabrielgodoi.dslist.controller;

import com.gabrielgodoi.dslist.DTO.GameMinDTO;
import com.gabrielgodoi.dslist.entities.Game;
import com.gabrielgodoi.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

}
