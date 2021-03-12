package com.evergreen.evergreen.service;

import com.evergreen.evergreen.model.Events_log;
import com.evergreen.evergreen.model.Plant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.sql.Timestamp;
import java.util.List;

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

         List<Events_log> myPlants = service.getEventsFromPlant(1);

         Assertions.assertEquals(myPlants.get(0).getPlant_id(),1);
         Assertions.assertEquals(myPlants.get(0).getWater_ammount(),5);
         Assertions.assertEquals(myPlants.get(0).getEvent_timestamp(),"2021-03-12 17:13:08.155");
         Assertions.assertEquals(myPlants.get(0).getEvent_type(),"watering");
     }
 }
