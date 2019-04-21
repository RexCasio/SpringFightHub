package com.tnikes.fighthub.service;

import java.util.List;

import com.tnikes.fighthub.model.GameCharacter;

public interface ICharacterService {
	
	public List<GameCharacter> findAllCharacters();
	
	public List<GameCharacter> findCharactersByGame(Integer gameId);
}