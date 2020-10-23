package com.evergreen.evergreen.repository;

import com.evergreen.evergreen.model.Plant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EvergreenRepositoryTests {

    @Autowired
    EvergreenRepository repository;


    @Test
    public void repositoryReturnsValidPlanWhenValidIdIsReceived(){

        Plant myPlant = repository.findById(1);

        Assertions.assertTrue(myPlant.getId().equals(1));
        Assertions.assertTrue(myPlant.getAge().equals(5));
        Assertions.assertTrue(myPlant.getSize().equals(50));
        Assertions.assertTrue(myPlant.getName().equals("Name 1"));
        Assertions.assertTrue(myPlant.getSpecies().equals("Species 1"));
        Assertions.assertTrue(myPlant.getStatus().equals("Alive"));
    }

}
