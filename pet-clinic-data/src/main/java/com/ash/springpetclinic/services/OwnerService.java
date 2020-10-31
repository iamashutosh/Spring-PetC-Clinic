package com.ash.springpetclinic.services;

import com.ash.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String name);
    Owner fndById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
