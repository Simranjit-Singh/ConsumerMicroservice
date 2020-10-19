package com.microservice.consumer;

import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class RegistrationController {

    public static final String REGISTRATION_SERVICE_URL = "http://M2";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.POST,value = "/register" )
    @ResponseBody
    public User register(@RequestBody User user) {
        User userResponse= restTemplate.postForObject(REGISTRATION_SERVICE_URL + "/user/save", user, User.class);
        return  userResponse;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable int id) {
        User userResponse= restTemplate.getForObject(REGISTRATION_SERVICE_URL + "/user/{id}", User.class, id);
        return  userResponse;
    }

}

