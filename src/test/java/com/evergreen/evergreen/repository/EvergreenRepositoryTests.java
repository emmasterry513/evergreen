package com.evergreen.evergreen.repository;

import com.evergreen.evergreen.model.Plant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
 public class EvergreenRepositoryTests {

     @Autowired
     EvergreenRepository repository;


     @Test
     public void repositoryReturnsValidPlanWhenValidIdIsReceived(){

         Plant myPlant = repository.findById(1);

         Assertions.assertEquals(myPlant.getId(),1);
         Assertions.assertEquals(myPlant.getAge(),3);
         Assertions.assertEquals(myPlant.getSize(),12);
         Assertions.assertEquals(myPlant.getName(),"Little Bamboo");
     }

 }
