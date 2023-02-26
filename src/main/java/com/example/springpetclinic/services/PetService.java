package com.example.springpetclinic.services;

import com.example.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    public Pet findById(Long Id);

    public Pet save(Pet owner);

    public Set<Pet> findAll();
}
