package com.animalshelter.controllers;

import com.animalshelter.storages.SpeciesStorage;

public class SpeciesController {

    private SpeciesStorage speciesStorage;

    public SpeciesController(SpeciesStorage speciesStorage) {
        this.speciesStorage = speciesStorage;
    }
}
