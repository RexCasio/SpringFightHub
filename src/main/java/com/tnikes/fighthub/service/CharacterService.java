package com.tnikes.fighthub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnikes.fighthub.model.GameCharacter;
import com.tnikes.fighthub.repository.CharacterRepository;

@Service
public class CharacterService implements ICharacterService {
	
	@Autowired
	private CharacterRepository repository;

	@Override
	public List<GameCharacter> findAllCharacters() {
		
		List<GameCharacter> gameChars = repository.findAllCharacters();
		return gameChars;
	}

	@Override
	public List<GameCharacter> findCharactersByGame(Integer gameId) {
		
		List<GameCharacter> gameChars = repository.findCharactersByGame(gameId);
		return gameChars;
	}
	
}