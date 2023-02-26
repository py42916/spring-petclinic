package com.example.springpetclinic.services;

import com.example.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    public Vet findById(Long Id);

    public Vet save(Vet owner);

    public Set<Vet> findAll();
}
