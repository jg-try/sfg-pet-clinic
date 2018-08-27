package com.jgt.sfgpetclinic.services;

import java.util.Set;

import com.jgt.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet Vet);

	Set<Vet> findAll();
}
