package com.tnikes.fighthub.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tnikes.fighthub.model.Game;
import com.tnikes.fighthub.service.IGameService;

@RestController
public class MainDataController {
	
//	final static String DEFAULT_API_PATH = "/fighthubAPI";
	
	@Autowired
	private IGameService gameService;
	
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
	
}