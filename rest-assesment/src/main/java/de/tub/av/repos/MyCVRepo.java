package de.tub.av.repos;
import org.springframework.data.repository.CrudRepository;

import de.tub.av.models.MyCV;

public interface MyCVRepo extends CrudRepository<MyCV, Integer>{
	
}
