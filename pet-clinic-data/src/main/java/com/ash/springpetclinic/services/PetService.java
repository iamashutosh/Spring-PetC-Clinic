package com.ash.springpetclinic.services;

import com.ash.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet fndById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
