package com.tnikes.fighthub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tnikes.fighthub.model.Normals;

@Repository
public interface NormalsRepository extends CrudRepository<Normals, Long> {
	
	
}