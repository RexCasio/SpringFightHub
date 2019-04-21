package com.tnikes.fighthub.service;

import com.tnikes.fighthub.model.Game;
import java.util.List;

public interface IGameService {
	
	public List<Game> findAllGames();
	
	public List<Game> findGameByGenre(String category);
	
	public List<Game> findGameByName(String gameName);
}
