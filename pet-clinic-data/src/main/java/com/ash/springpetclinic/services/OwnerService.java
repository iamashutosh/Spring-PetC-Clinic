package com.ash.springpetclinic.services;

import com.ash.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String name);
}
