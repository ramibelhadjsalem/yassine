package com.yassine.yassine.Controllers;

import com.yassine.yassine.Models.Person;
import com.yassine.yassine.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    PersonService personService ;

    public PersonController() {
    }
    @GetMapping("")
    public List<Person> getAll(){
        return  personService.getAll();
    }
    @PostMapping("")
    public  Person addPerson(@RequestBody Person person){
        return  personService.addPerson(person) ;
    }
    @GetMapping("/{id}")
    public Optional<Person> getPersoneBy(@PathVariable Long id){
        return personService.getById(id);
    }
    @DeleteMapping("/{id}")
    public  List<Person> deleteById(@PathVariable Long id){
        return personService.deleteById(id) ;
    }
    @GetMapping("/username/{name}")
    public Optional<Person> getByName(@PathVariable String name){
        return personService.findByname(name);
    }
}
