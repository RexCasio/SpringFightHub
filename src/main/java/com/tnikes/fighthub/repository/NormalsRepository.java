package com.tnikes.fighthub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tnikes.fighthub.model.Normals;

@Repository
public interface NormalsRepository extends CrudRepository<Normals, Long> {
	
	//A lot of work needs to be done in this file. Perhaps even removed and just combined into the character repository.
	@Query(value = 
			"SELECT normals.* FROM normals WHERE normals.char_id = "
			+ "("
			+ "SELECT characters.id FROM characters WHERE LOWER(characters.character_name) LIKE LOWER(CONCAT('%',?1,'%'))"
			+ ")", nativeQuery = true)
	List<Normals> findNormalsByChar(String name);
	
}