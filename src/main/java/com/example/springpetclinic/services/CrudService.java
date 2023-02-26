package com.example.springpetclinic.services;

import java.util.Set;

// Note the use of generics in interface definition.
// T is the type of the object under consideration.
// ID is the type of the object's identifier field.

public interface CrudService<T, ID> {

      public Set<T> findAll();

      T findById(ID id);

      T save(T object);

      void delete(T object);

      void deleteById(ID id);


}
