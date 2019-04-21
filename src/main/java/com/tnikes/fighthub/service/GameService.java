package com.tnikes.fighthub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnikes.fighthub.model.Game;
import com.tnikes.fighthub.repository.GameRepository;

@Service
public class GameService implements IGameService {
	
	@Autowired
	private GameRepository repository;
	
	@Override
	public List<Game> findAllGames() {
		
		List<Game> games = (List<Game>) repository.findAllGames();
		return games;
	}

	@Override
	public List<Game> findGameByGenre(String category) {
		
		List<Game> games = (List<Game>) repository.findGameByGenre(category);
		return games;
	}

	@Override
	public List<Game> findGameByName(String gameName) {
		
		List<Game> games = (List<Game>) repository.findGameByName(gameName);
		return games;
	}
	
}