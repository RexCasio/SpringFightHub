package com.tnikes.fighthub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tnikes.fighthub.model.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
	
	@Query(value = "SELECT * FROM games;", nativeQuery = true)
	List<Game> findAllGames();
	
	@Query(value = "SELECT * FROM games WHERE type=?1", nativeQuery = true)
	List<Game> findGameByGenre(String category);
	
	@Query(value = "SELECT * FROM games WHERE LOWER(game_name) LIKE LOWER(CONCAT('%',?1,'%'))", nativeQuery = true)
	List<Game> findGameByName(String gameName);
	
}