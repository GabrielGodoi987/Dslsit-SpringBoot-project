package com.gabrielgodoi.dslist.services;

import com.gabrielgodoi.dslist.DTO.GameListDTO;
import com.gabrielgodoi.dslist.entities.GameList;
import com.gabrielgodoi.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> getAllLists() {
        List<GameList> result = this.gameListRepository.findAll();
        return result.stream().map(el -> new GameListDTO(el)).toList();
    }
}
