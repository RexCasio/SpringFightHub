package com.tnikes.fighthub.service;

import com.tnikes.fighthub.model.Normals;
import java.util.List;


public interface INormalService {
	
	// lol
	public List<Normals> findNormalsByChar(String name);
}