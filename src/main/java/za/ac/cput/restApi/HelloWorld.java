package za.ac.cput.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Game330 on 2016-08-22.
 */


@RestController
public class HelloWorld {
    @Autowired



    @RequestMapping("/hello")

    public String getValue()
    {
        return "Hi There im from Mphokeli Server";
    }


}
