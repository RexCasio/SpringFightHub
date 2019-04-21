package com.tnikes.fighthub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tnikes.fighthub.model.GameCharacter;

@Repository
public interface CharacterRepository extends CrudRepository<GameCharacter, Long> {
	
	@Query(value = "SELECT * FROM characters;", nativeQuery = true)
	List<GameCharacter> findAllCharacters();
	
	@Query(value = "SELECT * FROM characters WHERE game_id=?1;", nativeQuery = true)
	List<GameCharacter> findCharactersByGame(Integer type);
	
	@Query(value = "SELECT * FROM characters WHERE LOWER(character_name) LIKE LOWER(CONCAT('%',?1,'%'))", nativeQuery = true)
	List<GameCharacter> findCharacterByName(String name);
		
}