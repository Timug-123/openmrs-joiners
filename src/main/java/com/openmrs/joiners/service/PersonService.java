package com.openmrs.joiners.service;

import com.openmrs.joiners.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService{

    @Autowired
    private PersonRepository personRepository;
}
