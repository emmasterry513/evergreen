package com.evergreen.evergreen.service;

import com.evergreen.evergreen.model.Plant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

 @SpringBootTest
 @ActiveProfiles("test")
 public class EvergreenServiceTests {

     @Autowired
     EvergreenService service;

     @Test
     public void getPlanInformationByIdReturnsPlanWithValidId (){

         Plant myPlant = service.getPlanInformationById(1);

         Assertions.assertEquals(myPlant.getId(),1);
         Assertions.assertEquals(myPlant.getAge(),3);
         Assertions.assertEquals(myPlant.getSize(),12);
         Assertions.assertEquals(myPlant.getName(),"Little Bamboo");
     }
     @Test
     public void getEventsFromPlantByIdReturnsPlantEvents (){

         Plant myPlant = service.getEventsFromPlant(1);

         Assertions.assertEquals(myPlant.getPlant_id(),1);
         Assertions.assertEquals(myPlant.getWater_ammount(),50);
         Assertions.assertEquals(myPlant.getEvent_timestamp(),timestamp);
         Assertions.assertEquals(myPlant.getEvent_type(),watering);
     }
 }
