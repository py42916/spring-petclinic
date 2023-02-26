package com.example.springpetclinic.services.map;

import com.example.springpetclinic.model.Owner;
import com.example.springpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {

    public Set<Owner> findAll() {
        return super.findAll();
    }

    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public void delete(Owner object) {
        super.delete(object);
    }

    public Owner save(Owner object) {
        return super.save(object.getId(), object):
    }

    public Owner findById(Long id) {
        return super.findById(id);
    }
}
