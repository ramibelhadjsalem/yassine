package com.yassine.yassine.Repository;

import com.yassine.yassine.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersoneRepository extends JpaRepository<Person,Long> {
    Optional<Person> findByName(String name);


}
