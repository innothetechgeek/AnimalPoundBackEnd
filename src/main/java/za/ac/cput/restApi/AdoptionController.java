package za.ac.cput.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import za.ac.cput.domain.Adoption;
import za.ac.cput.services.adoption.AdoptionService;
import za.ac.cput.services.animal.AnimalService;

import java.util.List;

/**
 * Created by Game330 on 2016-08-28.
 */
@RestController
public class AdoptionController{
    @Autowired
    private AdoptionService myService;
    //--------------------------------------Create Adoption------------------------------------
    @RequestMapping(value = "/adoption/create", method = RequestMethod.PUT)
    public ResponseEntity<Void> createAdoption(@RequestBody Adoption adoption, UriComponentsBuilder ucBuilder)
    {
        myService.create(adoption);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/adoption/{id}").buildAndExpand(adoption.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }



    //-------------------Retrieve Single Adoption--------------------------------------------------------
    @RequestMapping(value = "/adoption/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Adoption> getAdoption(@PathVariable("id") long id) {
        Adoption adoption= myService.readById(id);
        if (adoption == null) {
            return new ResponseEntity<Adoption>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Adoption>(adoption, HttpStatus.OK);
    }

    //---------------------Retrieve List of Adoptions---------------------------------------------------
    @RequestMapping(value = "/adoptions/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Adoption>> getAllAdoptops()
    {
        List<Adoption> clients = myService.readAll();
        if(clients.isEmpty())
        {
            return new ResponseEntity<List<Adoption>>(HttpStatus.NO_CONTENT);//OR HttpStatus.Not_Found
        }

        return new ResponseEntity<List<Adoption>>(clients,HttpStatus.OK);
    }

    @RequestMapping(value = "/adoption/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Adoption> deleteAdoption(@PathVariable("id")long id)
    {
        System.out.println("Fetching & Deleting Adoption with id" + id);

        Adoption adoption = myService.readById(id);
        if(adoption == null)
        {
            System.out.println("Unable to delete. Adoption with id " + id + " not found");//comment
            return new ResponseEntity<Adoption>(HttpStatus.NOT_FOUND);

        }

        myService.delete(adoption);
        return new ResponseEntity<Adoption>(HttpStatus.NO_CONTENT);
    }

    //----------------------------------Update----------------------------------------------------
    @RequestMapping(value = "Adoption/update/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Adoption> updateAdoption(@PathVariable("id") long id, @RequestBody Adoption adoption)
    {
        System.out.println("Updating Adoption " + id);

        Adoption currentAdoption = myService.readById(id);

        if(currentAdoption == null)
        {
            System.out.println("Adoption with id" +id+ "not found");
            return new ResponseEntity<Adoption>(HttpStatus.NOT_FOUND);
        }

        Adoption updatedAdoption = new Adoption.Builder().copy(currentAdoption)
                .id(adoption.getId())
                .animalName(adoption.getAnimalName())
                .customerName(adoption.getCustomerName())
                .customerSurname(adoption.getCustomerSurname())
                .date(adoption.getDate())
                .build();
        myService.update(updatedAdoption);

        return new ResponseEntity<Adoption>(updatedAdoption,HttpStatus.OK);
    }
}
