package com.animalshelter.storages.repositories;

import org.springframework.data.repository.CrudRepository;
import com.animalshelter.entities.Species;

public interface SpeciesRepository extends CrudRepository<Species, Long> {}
