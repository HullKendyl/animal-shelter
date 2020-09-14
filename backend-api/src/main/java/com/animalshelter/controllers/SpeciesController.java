package com.animalshelter.controllers;

import org.springframework.web.bind.annotation.*;
import com.animalshelter.entities.Species;
import com.animalshelter.storages.SpeciesStorage;

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

    @DeleteMapping("/api/species/{speciesId}/delete/")
    public Collection<Species> deleteSpecies(@PathVariable long speciesId) {
        speciesStorage.delete(speciesId);
        return speciesStorage.retrieveAllSpecies();
    }
}
