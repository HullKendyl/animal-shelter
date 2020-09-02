package com.animalshelter.controllers;

import com.animalshelter.entities.Species;
import com.animalshelter.storages.SpeciesStorage;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class SpeciesController {

    private SpeciesStorage speciesStorage;

    public SpeciesController(SpeciesStorage speciesStorage) {
        this.speciesStorage = speciesStorage;
    }

    @GetMapping("/api/species")
    public Collection<Species> retrieveAllSpecies() { return speciesStorage.retrieveAllSpecies(); }

    @GetMapping("/api/species/{id}/")
    public Species retrieveSpeciesById(@PathVariable long id) { return speciesStorage.retrieveSpeciesById(id); }

    @PostMapping("/api/species/add/")
    public Collection<Species> addSpecies(@RequestBody Species species) {
        speciesStorage.save(species);
        return speciesStorage.retrieveAllSpecies();
    }
}
