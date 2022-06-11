package com.yassine.yassine.Services;

import com.yassine.yassine.Models.Person;
import com.yassine.yassine.Repository.PersoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    PersoneRepository personeRepository;
    public PersonService() {

    }
    public List<Person> getAll(){
        return  personeRepository.findAll();
    }
   public Person addPerson(Person person){
        return  personeRepository.save(person);
   }
   public Optional<Person> getById(Long id){
        return  personeRepository.findById(id);
   }
   public List<Person> deleteById(Long id){
        if(personeRepository.existsById(id)){
            personeRepository.deleteById(id);
        }


        return  this.getAll();
   }
   public Optional<Person> findByname(String name){
        return personeRepository.findByName(name);
    }
}
