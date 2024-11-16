package com.gabrielgodoi.dslist.services;

import com.gabrielgodoi.dslist.DTO.GameListDTO;
import com.gabrielgodoi.dslist.entities.GameList;
import com.gabrielgodoi.dslist.projections.GameMinProjection;
import com.gabrielgodoi.dslist.repositories.GameListRepository;
import com.gabrielgodoi.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> getAllLists() {
        List<GameList> result = this.gameListRepository.findAll();
        return result.stream().map(el -> new GameListDTO(el)).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            this.gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
