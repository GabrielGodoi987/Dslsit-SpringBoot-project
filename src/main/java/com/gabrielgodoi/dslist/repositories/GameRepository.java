package com.gabrielgodoi.dslist.repositories;

import com.gabrielgodoi.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// colocamos a entidade e o tipo do id da entidade
public interface GameRepository extends JpaRepository<Game, Long> {
}
