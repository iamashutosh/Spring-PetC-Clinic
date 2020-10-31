package com.ash.springpetclinic.services;


import com.ash.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet fndById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
