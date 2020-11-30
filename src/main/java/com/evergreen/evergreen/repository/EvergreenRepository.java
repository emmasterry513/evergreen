package com.evergreen.evergreen.repository;

import com.evergreen.evergreen.model.Events_log;
import com.evergreen.evergreen.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface EvergreenRepository extends CrudRepository<Plant,Long> {

    public Plant findById (Integer id);

    // Find events for a plant given an Id
    @Query("from Events_log where plant_id=:id")
    public List<Events_log> findLoggingEvents(@Param("id") Integer plantId);


}
