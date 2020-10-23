package com.evergreen.evergreen.repository;

import com.evergreen.evergreen.model.Plant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvergreenRepository<nativeQuery> extends CrudRepository<Plant, Long> {

    public Plant findById (Integer id);

    //@Query(value = "SELECT * FROM Plant u WHERE u.id = (SELECT a.id from status a where a.status=dead")),nativeQuery = true) 
    //List<Plant> findAllDeadPlantsNative();

}
