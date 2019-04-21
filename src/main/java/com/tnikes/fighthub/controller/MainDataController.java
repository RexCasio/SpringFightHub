package com.tnikes.fighthub.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tnikes.fighthub.model.Game;
import com.tnikes.fighthub.model.GameCharacter;
import com.tnikes.fighthub.service.ICharacterService;
import com.tnikes.fighthub.service.IGameService;

@RestController
public class MainDataController {
	
//	final static String DEFAULT_API_PATH = "/fighthubAPI";
	
	//Services
	@Autowired
	private IGameService gameService;
	
	@Autowired
	private ICharacterService characterService;
	
	//Default path 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String defaultPath() {
		
		return "o hi there";
	}
	
	//Path for the games. Only needs to have a get request since I don't want to be able to edit these values in the db from the api?
	@RequestMapping(value = "/games", method = RequestMethod.GET)
 	public List<Game> findGames(@RequestParam(value = "category", required = false) String category,
 								@RequestParam(value = "gameName", required = false) String gameName) {
		
		//Checking if either parameters exist
		Boolean categoryCheck, nameCheck;
		categoryCheck = category == null ? false : true;
		nameCheck = gameName == null ? false : true;
		
		//Declaring List to return here
		List<Game> games = new ArrayList<>();
		
		//Checking if either parameters exist in the path and returns a list accordingly
		//Did this instead of creating 2 separate request mapping
		//Should I move this logic out of here?
		if(nameCheck) {
			games = (List<Game>) gameService.findGameByName(gameName);
		} else if(categoryCheck) {
			games = (List<Game>) gameService.findGameByGenre(category);
		} else {
			games = (List<Game>) gameService.findAllGames();
		}
		
		return games;
	}
	
	//Path for the characters. There should probably be a separate path for game specified characters. EX: guiltygear/characters or guiltygear/characters?name=venom
	//Again, do not need to run CUD of CRUD for this endpoint.
	@RequestMapping(value = "/characters", method = RequestMethod.GET)
	public List<GameCharacter> findCharacters(@RequestParam(value = "type", required = false) Integer gameId) {
		
		//Checking if the gameid is provided. This should really be a name(String) that gets converted to the required id from a SQL search.
		//The below logic should pull up a game id given a string for a fighting game name. This should not be within the controller itself though.
		Boolean gameIdCheck;
		gameIdCheck = gameId == null ? false : true;
		
		List<GameCharacter> gameCharacters = new ArrayList<>();
		
		//Checking if gameid is provided and returning characters for specific game. If not, returning all characters lol.
		if(gameIdCheck) {
			gameCharacters = (List<GameCharacter>) characterService.findCharactersByGame(gameId);
		} else {
			gameCharacters = (List<GameCharacter>) characterService.findAllCharacters();
		}
		
		return gameCharacters;
	}
	
}