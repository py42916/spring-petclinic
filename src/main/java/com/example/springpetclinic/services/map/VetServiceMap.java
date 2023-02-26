package com.example.springpetclinic.services.map;

import com.example.springpetclinic.model.Vet;
import com.example.springpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {


    public Set<Vet> findAll() {
        return super.findAll();
    }

    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public void delete(Vet object) {
        super.delete(object);
    }

    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    public Vet findById(Long id) {
        return super.findById(id);
    }
}
