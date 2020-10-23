package com.evergreen.evergreen.repository;

import com.evergreen.evergreen.model.Plant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvergreenRepository extends CrudRepository<Plant, Long> {

    public Plant findById (Integer id);

}
