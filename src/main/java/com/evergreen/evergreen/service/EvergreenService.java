package com.evergreen.evergreen.service;

import com.evergreen.evergreen.model.Events_log;
import com.evergreen.evergreen.model.Plant;
import com.evergreen.evergreen.repository.EvergreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Timestamp;
import java.util.ArrayList;
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


    public List<Plant> getPlantsHaveBeenWatered (Integer hourFrom) {
        Timestamp timestamp_from = new Timestamp(System.currentTimeMillis() - (hourFrom * 60 * 60 * 1000));

        List<Events_log> myEventsInLast2hours = repository.findPlantsWateredInTheLastHour(timestamp_from);

        List<Plant> myWateredPlants = new ArrayList<>();


        // Loop againts our events list, this list contains several event for several plants
        for (int i = 0 ; i < myEventsInLast2hours.size(); i++){
            // We want to add to the watered plant list only unique records, so if one plant has been watered
            // several times in the last hour, we only have one record of it on the watered plant list
            boolean isPlantOnTheList = false;
            // The way to check if the plant has been already added is by reviewing / iterating the watered plan
            // list
            for(int j = 0; j < myWateredPlants.size(); j++){
                // Check if the plant id of the watered plant list matches with the one that we want to add
                if(myWateredPlants.get(j).getId().equals(myEventsInLast2hours.get(i).getPlant().getId())){
                    // Plant is already added to the list
                    isPlantOnTheList = true;
                }
            }

            if(isPlantOnTheList == false) myWateredPlants.add(myEventsInLast2hours.get(i).getPlant());
        }

        return myWateredPlants;
    }

}
