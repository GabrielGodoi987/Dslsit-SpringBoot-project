package com.gabrielgodoi.dslist.repositories;

import com.gabrielgodoi.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
