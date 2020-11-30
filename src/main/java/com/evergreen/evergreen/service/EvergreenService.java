package com.evergreen.evergreen.service;

import com.evergreen.evergreen.model.Events_log;
import com.evergreen.evergreen.model.Plant;
import com.evergreen.evergreen.repository.EvergreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Timestamp;
import java.util.List;

@Service
public class EvergreenService {


    @Autowired
    EvergreenRepository repository;

    public Plant getPlanInformationById (Integer id){

        Plant myPlant = repository.findById(id);
        return myPlant;

    }

    public List<Events_log> getEventsFromPlant (Integer id){
        return (repository.findLoggingEvents(id));
    }

}
