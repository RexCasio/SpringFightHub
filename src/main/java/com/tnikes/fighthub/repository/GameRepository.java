package com.tnikes.fighthub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tnikes.fighthub.model.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
	
	
}