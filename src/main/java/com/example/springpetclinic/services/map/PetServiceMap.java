package com.example.springpetclinic.services.map;

import com.example.springpetclinic.model.Pet;
import com.example.springpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet,Long> {
    public Set<Pet> findAll() {
        return super.findAll();
    }

    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public void delete(Pet object) {
        super.delete(object);
    }

    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    public Pet findById(Long id) {
        return super.findById(id);
    }
}
