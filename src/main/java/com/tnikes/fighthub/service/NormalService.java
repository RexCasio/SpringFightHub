package com.tnikes.fighthub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnikes.fighthub.model.Normals;
import com.tnikes.fighthub.repository.NormalsRepository;

@Service
public class NormalService implements INormalService {
	
	@Autowired
	private NormalsRepository repository;

	@Override
	public List<Normals> findNormalsByChar(String name) {
		
		List<Normals> normals = repository.findNormalsByChar(name);
		return normals;
	}
	
}