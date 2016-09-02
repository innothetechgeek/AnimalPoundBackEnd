package za.ac.cput.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import za.ac.cput.domain.Animal;
import za.ac.cput.services.animal.AnimalService;

import java.util.List;


/**
 * Created by Game330 on 2016-08-27.
 */
@RestController
public class AnimalController {
    @Autowired
    private AnimalService myService;

    //--------------------------------------Create Client------------------------------------
    @RequestMapping(value = "/animal/create", method = RequestMethod.PUT)
    public ResponseEntity<Void> createAnimal(@RequestBody Animal animal, UriComponentsBuilder ucBuilder)
    {
        myService.create(animal);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/animal/{id}").buildAndExpand(animal.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }



    //-------------------Retrieve Single Story--------------------------------------------------------
    @RequestMapping(value = "/animal/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Animal> getAnimal(@PathVariable("id") long id) {
        Animal myAnimal= myService.readById(id);
        if (myAnimal == null) {
            //return new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Animal>(myAnimal, HttpStatus.OK);
    }

    //---------------------Retrieve List of Clients---------------------------------------------------

    @RequestMapping(value = "/Animals/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Animal>> getAllAdoptops()
    {
        List<Animal> clients = myService.readAll();
        if(clients.isEmpty())
        {
            return new ResponseEntity<List<Animal>>(HttpStatus.NO_CONTENT);//OR HttpStatus.Not_Found
        }

        return new ResponseEntity<List<Animal>>(clients,HttpStatus.OK);
    }

    @RequestMapping(value = "/animal/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Animal> deleteAdoption(@PathVariable("id")long id)
    {
        System.out.println("Fetching & Deleting Patient with id" + id);

        Animal animal = myService.readById(id);
        if(animal == null)
        {
            System.out.println("Unable to delete. Adoption with id " + id + " not found");//comment
            return new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);

        }

        myService.delete(animal);
        return new ResponseEntity<Animal>(HttpStatus.NO_CONTENT);
    }

    //----------------------------------Update----------------------------------------------------
    @RequestMapping(value = "animal/update/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Animal> updateAdoption(@PathVariable("id") long id, @RequestBody Animal animal)
    {
        System.out.println("Updating Adoption " + id);

        Animal currentAnimal = myService.readById(id);

        if(currentAnimal == null)
        {
            System.out.println("Client with id" +id+ "not found");
            return new ResponseEntity<Animal>(HttpStatus.NOT_FOUND);
        }

        Animal updatedAnimal = new Animal.Builder().copy(currentAnimal)
                .id(animal.getId())
                .breed(animal.getBreed())
                .name(animal.getName())
                .livingArea(animal.getlivingArea())
                .build();
        myService.update(currentAnimal);

        return new ResponseEntity<Animal>(updatedAnimal,HttpStatus.OK);
    }
}
