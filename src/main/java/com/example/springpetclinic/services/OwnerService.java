package com.example.springpetclinic.services;

import com.example.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    public Owner findById(Long Id);

    public Owner save(Owner owner);

    public Set<Owner> findAll();
}
