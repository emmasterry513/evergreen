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
 }
