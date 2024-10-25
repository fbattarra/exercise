package be.abis.exercise.controller;

import be.abis.exercise.model.Person;
import be.abis.exercise.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonApiController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    //ex.:  bob.smith@oracle.com ; abc986
    public Person findPersonByMailAndPwd(@RequestParam("email")String email, @RequestParam("password") String password){
        Person p = personRepository.findPerson(email, password);
        return p;
    }
}
