package com.tnikes.fighthub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tnikes.fighthub.model.Normals;

@Repository
public interface NormalsRepository extends CrudRepository<Normals, Long> {
	
	@Query(value = "SELECT * FROM normals WHERE char_id=?1", nativeQuery = true)
	List<Normals> findNormalsByChar(Integer charId);
	
}