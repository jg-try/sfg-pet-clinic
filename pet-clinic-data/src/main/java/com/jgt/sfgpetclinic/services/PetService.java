package com.jgt.sfgpetclinic.services;

import java.util.Set;

import com.jgt.sfgpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet Pet);

	Set<Pet> findAll();
}
