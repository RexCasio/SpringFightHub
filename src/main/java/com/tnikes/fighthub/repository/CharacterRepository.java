package com.tnikes.fighthub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tnikes.fighthub.model.GameCharacter;

@Repository
public interface CharacterRepository extends CrudRepository<GameCharacter, Long> {
	
	
}