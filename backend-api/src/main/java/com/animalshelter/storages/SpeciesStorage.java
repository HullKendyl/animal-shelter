package com.animalshelter.storages;

import com.animalshelter.entities.Species;
import com.animalshelter.storages.repositories.SpeciesRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SpeciesStorage {

    private SpeciesRepository speciesRepo;

    public SpeciesStorage(SpeciesRepository speciesRepo) {this.speciesRepo = speciesRepo;}

    public Collection<Species> retrieveAllSpecies() {return (Collection<Species>) speciesRepo.findAll();}

    public Species retrieveSpeciesById(long id) {return speciesRepo.findById(id).get();}

    public Species save(Species species) {return speciesRepo.save(species);}

    public void delete(long id) {speciesRepo.deleteById(id);}
}
